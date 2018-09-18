package harrypotterkata.hogwarts.wizard.duelling;

import harrypotterkata.hogwarts.wizard.Wizard;
import org.junit.Test;

import static harrypotterkata.hogwarts.wizard.Wizard.createWizardlyWizard;
import static org.assertj.core.api.Assertions.assertThat;

public class DuellingClubTest {

    @Test
    public void duel() {
        Wizard theAlmightyDumbledore = createWizardlyWizard("Dumbledore");
        Wizard heWhoMustNotBeNamed = createWizardlyWizard("Tom Riddle");

        Wizard winner = new DuellingClub().duel(theAlmightyDumbledore, heWhoMustNotBeNamed);

        if (winner.equals(theAlmightyDumbledore)) {
            assertThat(winner.getName()).isEqualTo("Dumbledore");
        } else {
            assertThat(winner.getName()).isEqualTo("Tom Riddle");
        }
    }
}