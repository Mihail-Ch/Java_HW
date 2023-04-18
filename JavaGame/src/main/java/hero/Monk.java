package hero;

import java.util.ArrayList;

public class Monk extends BaseHero {


    public Monk(int xPosition, int yPosition) {
        super(xPosition, yPosition);
    }

    public Monk(boolean team, int[] damag, int health, int healthMax) {
        super(team, damag, health, healthMax);
    }

    @Override
    public String GetInfo() {

        return "Привет я -Монах-, мое имя";
    }

    @Override
    public void Step() { }
}


