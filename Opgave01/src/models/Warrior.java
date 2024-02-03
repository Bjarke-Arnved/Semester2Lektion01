package models;

import java.util.ArrayList;

public class Warrior extends Character {
    private ArrayList<Weapon> weapons;

    public Warrior(String name, int level) {
        super(name, level);
        weapons = new ArrayList<Weapon>();
    }
    public void lootWeapon(Weapon weapon) {
        weapons.add(weapon);
    }
    public ArrayList<Weapon> getCarriedWeapons() {
        return new ArrayList<Weapon>(weapons);
    }
}