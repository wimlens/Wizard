package harrypotterkata.hogwarts.wizard.spells;

import harrypotterkata.hogwarts.wizard.Wizard;
import harrypotterkata.hogwarts.wizard.random.RandomEnum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Spell {

    CONFRINGO("attacking", 10),
    PETRIFICUS_TOTALUS("attacking", 15),
    LEVICORPUS("attacking", 12),
    REDUCTO("attacking", 7),
    RICTUSEMPRA("attacking", 17),
    SECTUMSEMPRA("attacking", 9),
    STUPEFY("attacking", 6),

    EXPELLIARMUS("defensive", 0),
    EXPECTO_PATRONUM("defensive", 0),
    PROTEGO("defensive", 0),

    CRUCIO("unforgivable", 100),
    IMPERIO("unforgivable", 100),
    AVADA_KEDAVRA("unforgivable", 100);

    private String kindOfSpell;
    private int damage;

    Spell(String kindOfSpell, int damage) {
        this.kindOfSpell = kindOfSpell;
        this.damage = damage;
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

    public static Spell getRandomSpell(){
       return RandomEnum.getRandom(Spell.class);
    }

    public int getDamage() {
        return damage;
    }

    private String getKindOfSpell() {
        return kindOfSpell;
    }

    public void applyTo(Wizard summoningWizard, Wizard opponent) {
        switch (getKindOfSpell()){
            case "defensive" :
                summoningWizard.protectUsing(this);
                break;
            case "unforgivable" :
                opponent.defendAgainst(this);
                summoningWizard.scarOwnSoul();
                break;
            default:
                opponent.defendAgainst(this);
        }
    }
}
