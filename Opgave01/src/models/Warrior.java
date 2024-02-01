package models;

import java.util.ArrayList;

public class Warrior extends Character {
    private ArrayList<Weapon> weapons;

    public Warrior(String name, int level) {
        super(name, level);
    }
}