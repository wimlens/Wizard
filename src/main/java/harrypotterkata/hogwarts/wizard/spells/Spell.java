package harrypotterkata.hogwarts.wizard.spells;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Spell {

    CONFRINGO("attacking"),
    PETRIFICUS_TOTALUS("attacking"),
    LEVICORPUS("attacking"),
    REDUCTO("attacking"),
    RICTUSEMPRA("attacking"),
    SECTUMSEMPRA("attacking"),
    STUPEFY("attacking"),

    EXPELLIARMUS("defensive"),
    EXPECTO_PATRONUM("defensive"),
    PROTEGO("defensive"),

    CRUCIO("unforgivable"),
    IMPERIO("unforgivable"),
    AVADA_KEDAVRA("unforgivable");

    private String kindOfSpell;

    Spell(String kindOfSpell) {
        this.kindOfSpell = kindOfSpell;
    }

    public static List<Spell> getAttackingSpells(){
        return Arrays.stream(Spell.values())
                .filter(spell -> spell.kindOfSpell.equals("attacking"))
                .collect(Collectors.toList());
    }

    public static List<Spell> getDefensiveSpells(){
        return Arrays.stream(Spell.values())
                .filter(spell -> spell.kindOfSpell.equals("defensive"))
                .collect(Collectors.toList());
    }

    public static List<Spell> getHorribleUnforgivableSpells(){
        return Arrays.stream(Spell.values())
                .filter(spell -> spell.kindOfSpell.equals("unforgivable"))
                .collect(Collectors.toList());
    }
}
