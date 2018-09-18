package harrypotterkata.hogwarts.wizard;

import java.util.Random;
import java.util.logging.Logger;

public class SortingHat {
    private static final Random RANDOM = new Random();

    public static House determineHouseForWizard() {
        House house = randomHouse(House.class);
        System.out.println("You are sorted in: " + house.name());
        return house;
    }

    private static <T extends Enum<?>> T randomHouse(Class<T> clazz){
        int x = RANDOM.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
}
