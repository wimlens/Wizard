package harrypotterkata.hogwarts.wizard;

public class Wizard {
    private String name;

    private Wizard(String name) {
        this.name = name;
    }

    public static Wizard createWizardlyWizard(String name) {
        return new Wizard(name);
    }

    public String getName() {
        return name;
    }
}
