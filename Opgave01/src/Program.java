package Program;
import models.*;

public class Program {
    public static void main(String[] args) {
        Barbarian fofstelr = new Barbarian("Fofstelr", 0);
        fofstelr.lootWeapon(new Weapon("longsword"));
        fofstelr.lootWeapon(new Ranged("Shortbow", 80));

        Wizard orlemaex = new Wizard("Orlemaex", 0);
        orlemaex.learnSpell(new Spell("Fireball", 150, Duration.INSTANTANEOUS));
        // This does not work because not all weapons are ranged.
        /*
        for(Weapon weapon : fofstelr.getCarriedWeapons()) {
            weapon.getRange();
        }

         */
        // Alternative way of doing it.
        for(Weapon weapon : fofstelr.getCarriedWeapons()) {
            if(weapon.getClass().equals(Ranged.class)) {
                System.out.println(((Ranged) weapon).getRange());
            }
        }
    }
}