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
        Announcer.congratsWinner(winner);
        return winner;
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
        Announcer.doIntro(a, b);
    }
}
