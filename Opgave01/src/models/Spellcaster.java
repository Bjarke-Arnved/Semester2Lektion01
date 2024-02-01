package models;

import java.util.ArrayList;

public class Spellcaster extends Character {
    private ArrayList<Spell> spells;
    public Spellcaster(String name, int level) {
        super(name,level);
        spells = new ArrayList<Spell>();
    }

    public ArrayList<Spell> getSpells() {
        return new ArrayList<Spell>(spells);
    }
}