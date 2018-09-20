package harrypotterkata.hogwarts.wizard;

import harrypotterkata.hogwarts.wizard.spells.Spell;

public class Wizard {
    private String name;
    private int hp;
    private House houseOfHogwarts;

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

    public void fireSpellAt(Wizard opponent) {
        Spell spell = chooseSpell();
        opponent.defendAgainst(spell);
    }

    private void defendAgainst(Spell spell) {
        updateHealth( Integer.max(0,  getHp() - spell.getDamage()));
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
}
