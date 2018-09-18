package harrypotterkata.hogwarts.wizard;

import static harrypotterkata.hogwarts.wizard.random.RandomEnum.getRandom;

public class SortingHat {
    public static House determineHouseForWizard() {
        House house = getRandom(House.class);
        System.out.println("You are sorted in: " + house.name());
        return house;
    }
}
