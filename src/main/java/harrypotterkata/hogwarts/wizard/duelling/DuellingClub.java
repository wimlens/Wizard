package harrypotterkata.hogwarts.wizard.duelling;

import harrypotterkata.hogwarts.wizard.Wizard;

import static java.lang.String.format;

class DuellingClub {

    private Wizard attackingWizard;
    private Wizard defendingWizard;
    private Wizard winner;

    Wizard duel(Wizard a, Wizard b) {
        introduceBothWizards(a, b);
        winner = fight();
        congratsWinner();
        return winner;
    }

    private void congratsWinner() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        sb.append("\n");
        sb.append("We have a winner ladies and gentleman!");
        sb.append("\n");
        sb.append(format("%s from %s is the rightful winner", winner.getName(), winner.getHouse().name().toLowerCase()));

        System.out.println(sb);
    }

    private Wizard fight() {
        do {
            attackingWizard.summonSpell(defendingWizard);
            checkThatAttackerWonDuel();
            defenderBecomesAttacker();
        } while (bothWizardsAreStillStanding());

        return winner;
    }

    private void checkThatAttackerWonDuel() {
        if (defendingWizardIsDefeated()) {
            winner = attackingWizard;
        }
    }

    private boolean defendingWizardIsDefeated() {
        return defendingWizard.getHp() == 0;
    }

    private void defenderBecomesAttacker() {
        Wizard previousAttacker = attackingWizard;
        Wizard previousDefender = defendingWizard;
        if (winner == null) {
            attackingWizard = previousDefender;
            defendingWizard = previousAttacker;
        }
    }

    private boolean bothWizardsAreStillStanding() {
        return attackingWizard.getHp() > 0 && defendingWizard.getHp() > 0;
    }

    private void introduceBothWizards(Wizard a, Wizard b) {
        this.attackingWizard = a;
        this.defendingWizard = b;
        StringBuilder sb = new StringBuilder();

        sb.append("Welcome, wizards of Hogwarts, at the duelling club!");
        sb.append("\n");
        sb.append("\n");
        sb.append(format("I want to introduce to you at our left side %s from house %s", attackingWizard.getName(), attackingWizard.getHouse().name().toLowerCase()));
        sb.append("\n");
        sb.append(format("The opponent at our right side is %s from house %s", defendingWizard.getName(), defendingWizard.getHouse().name().toLowerCase()));
        sb.append("\n");
        sb.append("\n");
        sb.append("I wish both sides good luck and may the best wizard win!");

        System.out.println(sb);
    }
}
