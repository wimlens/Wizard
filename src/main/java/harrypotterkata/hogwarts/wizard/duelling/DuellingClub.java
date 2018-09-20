package harrypotterkata.hogwarts.wizard.duelling;

import harrypotterkata.hogwarts.wizard.Wizard;

import static java.lang.String.format;

public class DuellingClub {

    private Wizard attackingWizard;
    private Wizard defendingWizard;

    public Wizard duel(Wizard a, Wizard b) {
        this.attackingWizard = a;
        this.defendingWizard = b;
        introduceBothWizards();
        Wizard winner = fight();
        congratsWinner(winner);
        return winner;
    }

    private void congratsWinner(Wizard winner) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        sb.append("\n");
        sb.append("We have a winner ladies and gentleman!");
        sb.append("\n");
        sb.append(format("%s from %s is the rightful winner", winner.getName(), winner.getHouse().name().toLowerCase()));

        System.out.println(sb);
    }

    private Wizard fight() {
        while (bothWizardsAreStillStanding()){
            attackingWizard.fireSpellAt(defendingWizard);
            if (defendingWizardIsDefeated()) {
                return attackingWizard;
            }
            defenderBecomesAttacker();
        }
        return null;
    }

    private boolean defendingWizardIsDefeated() {
        return defendingWizard.getHp() == 0;
    }

    private void defenderBecomesAttacker() {
        attackingWizard = defendingWizard;
        defendingWizard = attackingWizard;
    }

    private boolean bothWizardsAreStillStanding() {
        return attackingWizard.getHp() > 0 && defendingWizard.getHp() > 0;
    }

    private void introduceBothWizards() {
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
