package harrypotterkata.hogwarts.wizard.random;

import java.util.Random;

public class RandomEnum {
    private static final Random RANDOM = new Random();

    public static <T extends Enum<?>> T getRandom(Class<T> clazz){
        int x = RANDOM.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
}
