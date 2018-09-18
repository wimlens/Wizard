package harrypotterkata.hogwarts.wizard.duelling;

import harrypotterkata.hogwarts.wizard.Wizard;
import harrypotterkata.hogwarts.wizard.spells.Spell;

import static java.lang.String.format;

public class DuellingClub {

    public Wizard duel(Wizard a, Wizard b) {
        introduceBothWizards(a, b);
        Wizard winner = fight(a, b);
        congratsWinner(winner);
        return a;
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

    private Wizard fight(Wizard a, Wizard b) {
        int hpWizardA = a.getHp();
        int hpWizardB = b.getHp();
        Spell spellWizardB;
        Spell spellWizardA;

        while(hpWizardA > 0 && hpWizardB > 0){
            spellWizardA = Spell.getRandomSpell();
            hpWizardB -= spellWizardA.getDamage();
            System.out.println(format("%s is summoning the spell %s", a.getName(), spellWizardA));
            System.out.println(format("%s has %d hp left", b.getName(), hpWizardB));
            if (hpWizardB <= 0) {
                return a;
            }
            spellWizardB = Spell.getRandomSpell();
            hpWizardA -= spellWizardB.getDamage();
            System.out.println(format("%s is summoning the spell %s", b.getName(), spellWizardB));
            System.out.println(format("%s has %d hp left", a.getName(), hpWizardA));
            if (hpWizardA <=0){
                return b;
            }
        }
        return null;
    }

    private void introduceBothWizards(Wizard a, Wizard b) {
        StringBuilder sb = new StringBuilder();

        sb.append("Welcome wizards of Hogwarts, at the duelling club!");
        sb.append("\n");
        sb.append("\n");
        sb.append(format("I want to introduce to you at our left side %s from house %s", a.getName(), a.getHouse().name().toLowerCase()));
        sb.append("\n");
        sb.append(format("The opponent at our right side is %s from house %s", b.getName(), b.getHouse().name().toLowerCase()));
        sb.append("\n");
        sb.append("\n");
        sb.append("I wish both sides good luck and may the best wizard win");

        System.out.println(sb);
    }
}
