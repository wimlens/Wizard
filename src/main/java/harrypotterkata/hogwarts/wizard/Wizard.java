package harrypotterkata.hogwarts.wizard;

public class Wizard {
    private String name;
    private House houseOfHogwarts;

    private Wizard(String name) {
        this.name = name;
        this.houseOfHogwarts = SortingHat.determineHouseForWizard();
    }

    public static Wizard createWizardlyWizard(String name) {
        return new Wizard(name);
    }

    public String getName() {
        return name;
    }
}
