package hero;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Mage extends BaseHero {

    public Mage(boolean team, int[] damag, int health, int healthMax) {
        super(team, damag, health, healthMax);
    }

    @Override
    public String GetInfo() {
        return "Привет я -Маг-, мое имя";
    }

    @Override
    public void Step() { }
}
