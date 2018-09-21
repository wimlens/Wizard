package harrypotterkata.hogwarts.wizard;

import static harrypotterkata.hogwarts.wizard.random.RandomEnum.getRandom;

public class SortingHat {
    public static House determineHouseForWizard(String wizardName) {
        House house = getRandom(House.class);

        StringBuilder sb = new StringBuilder();
        sb.append("Sorting Hat:");
        sb.append("\n");
        sb.append("Hmm, who do we have here?");
        sb.append("\n");
        sb.append("Ah, I see, it's " + wizardName);
        sb.append("\n");
        sb.append("Where shall we put you...");
        sb.append("\n");
        sb.append("Oh, I know...");
        sb.append("\n");
        sb.append("OK " + wizardName + ", I'll put you in ... " + house.name() + "!");
        System.out.println(sb);

        return house;
    }
}
