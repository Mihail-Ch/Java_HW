package hero;

public class Peasant extends BaseHero {


    public Peasant(boolean team, int[] damag, int health, int healthMax) {
        super(team, damag, health, healthMax);
    }

    @Override
    public String GetInfo() {
        return "Привет я -Крестьянин-, мое имя";
    }

    @Override
    public void Step() { }
}
