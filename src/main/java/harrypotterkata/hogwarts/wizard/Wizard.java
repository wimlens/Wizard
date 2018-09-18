package harrypotterkata.hogwarts.wizard;

public class Wizard {
    private String name;
    private int hp;
    private House houseOfHogwarts;

    private Wizard(String name) {
        this.name = name;
        this.hp = 100;
        this.houseOfHogwarts = SortingHat.determineHouseForWizard();
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
}
