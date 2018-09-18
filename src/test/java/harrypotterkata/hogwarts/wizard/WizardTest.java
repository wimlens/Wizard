package harrypotterkata.hogwarts.wizard;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class WizardTest {

    @Test
    public void createWizardlyWizard() {
        Wizard theBoyWhoSurvived = Wizard.createWizardlyWizard("Harry Potter");

        Assertions.assertThat(theBoyWhoSurvived.getName()).isEqualTo("Harry Potter");
    }
}