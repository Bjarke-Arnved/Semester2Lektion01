import models.Spellcaster;
import models.Warrior;
/* A class can only inharit form one class.*/
public class Ranger extends Spellcaster /*, Warrior*/ {
    public Ranger(String name, int level) {
        super(name, level);
    }
}