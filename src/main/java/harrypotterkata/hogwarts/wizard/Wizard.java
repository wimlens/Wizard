package harrypotterkata.hogwarts.wizard;

import harrypotterkata.hogwarts.wizard.spells.Spell;

public class Wizard {
    private String name;
    private int hp;
    private House houseOfHogwarts;
    private Spell protectiveSpell;

    private Wizard(String name) {
        this.name = name;
        this.hp = 100;
        this.houseOfHogwarts = SortingHat.determineHouseForWizard(name);
    }

    public static Wizard createWizardlyWizard(String name) {
        return new Wizard(name);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public House getHouse() {
        return houseOfHogwarts;
    }

    public void summonSpell(Wizard opponent) {
        Spell spell = chooseSpell();
        spell.applyTo(this, opponent);
    }

    public void defendAgainst(Spell spell) {
        if (hasProtection()) {
            System.out.println(name + " is protected by " + getProtectiveSpell().name() + "! No damage done, smart cookie!");
            protectiveSpell = null;
        } else {
            updateHealth( Integer.max(0,  getHp() - spell.getDamage()));
        }
    }

    private boolean hasProtection() {
        return getProtectiveSpell() != null;
    }

    private Spell chooseSpell() {
        Spell randomSpell = Spell.getRandomSpell();
        System.out.println(getName() + " is summoning " + randomSpell.name());
        return randomSpell;
    }

    private void updateHealth(int newHP) {
        this.hp = newHP;
        System.out.println(getName() + " has " + getHp() + " HP left");
    }

    public void protectUsing(Spell spell) {
        protectiveSpell = spell;
    }

    private Spell getProtectiveSpell() {
        return protectiveSpell;
    }

    public void scarOwnSoul() {
        System.out.println(getName() + " used an unforgivable curse! That will scar his soul");
        updateHealth(Integer.max(0,  getHp() - 10));
    }
}
