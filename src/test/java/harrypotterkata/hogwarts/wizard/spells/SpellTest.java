package harrypotterkata.hogwarts.wizard.spells;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static harrypotterkata.hogwarts.wizard.spells.Spell.*;
import static org.assertj.core.api.Assertions.assertThat;

public class SpellTest {

    @Test
    public void getAttackingSpells() {
        List<Spell> attackingSpells = new ArrayList<>();
        attackingSpells.add(CONFRINGO);
        attackingSpells.add(PETRIFICUS_TOTALUS);
        attackingSpells.add(LEVICORPUS);
        attackingSpells.add(REDUCTO);
        attackingSpells.add(RICTUSEMPRA);
        attackingSpells.add(SECTUMSEMPRA);
        attackingSpells.add(STUPEFY);

        assertThat(Spell.getAttackingSpells()).isEqualTo(attackingSpells);
    }

    @Test
    public void getDefensiveSpells() {
        List<Spell> defensiveSpells = new ArrayList<>();
        defensiveSpells.add(EXPELLIARMUS);
        defensiveSpells.add(EXPECTO_PATRONUM);
        defensiveSpells.add(PROTEGO);

        assertThat(Spell.getDefensiveSpells()).isEqualTo(defensiveSpells);
    }

    @Test
    public void getHorribleUnforgivableSpells() {
        List<Spell> horribleUnforgivableSpells = new ArrayList<>();
        horribleUnforgivableSpells.add(CRUCIO);
        horribleUnforgivableSpells.add(IMPERIO);
        horribleUnforgivableSpells.add(AVADA_KEDAVRA);

        assertThat(Spell.getHorribleUnforgivableSpells()).isEqualTo(horribleUnforgivableSpells);
    }
}