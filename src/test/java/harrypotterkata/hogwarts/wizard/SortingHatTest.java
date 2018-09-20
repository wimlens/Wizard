package harrypotterkata.hogwarts.wizard;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static harrypotterkata.hogwarts.wizard.House.*;

public class SortingHatTest {

    @Test
    public void determineHouseForWizard() {
        House result = SortingHat.determineHouseForWizard("Xan");

        Assertions.assertThat(result).isIn(GRYFFINDOR, SLYTHERIN, HUFFLEPUFF, RAVENCLAW);

    }
}