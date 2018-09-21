package harrypotterkata.hogwarts.wizard;

import harrypotterkata.hogwarts.wizard.spells.Spell;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static harrypotterkata.hogwarts.wizard.spells.Spell.PROTEGO;
import static harrypotterkata.hogwarts.wizard.spells.Spell.SECTUMSEMPRA;
import static org.assertj.core.api.Assertions.assertThat;

public class WizardTest {

    @Test
    public void createWizardlyWizard() {
        Wizard theBoyWhoSurvived = Wizard.createWizardlyWizard("Harry Potter");

        assertThat(theBoyWhoSurvived.getName()).isEqualTo("Harry Potter");
    }

    @Test
    public void wizardWithDefenseDoesNotLoseHP() throws Exception {
        Wizard hermione = Wizard.createWizardlyWizard("Hermione Granger");
        hermione.protectUsing(PROTEGO);

        hermione.defendAgainst(SECTUMSEMPRA);

        assertThat(hermione.getHp()).isEqualTo(100);
    }

    @Test
    public void wizardWithoutDefenseLosesHP() throws Exception {
        Wizard hermione = Wizard.createWizardlyWizard("Hermione Granger");

        hermione.defendAgainst(SECTUMSEMPRA);

        assertThat(hermione.getHp()).isEqualTo(91);
    }
}