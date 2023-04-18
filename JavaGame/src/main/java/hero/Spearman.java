package hero;

public class Spearman extends BaseHero {

    public Spearman(boolean team, int[] damag, int health, int healthMax) {
        super(team, damag, health, healthMax);
    }

    @Override
    public String GetInfo() {

        return "Привет я -Копейщик-, мое имя";
    }

    @Override
    public void Step() { }
}
