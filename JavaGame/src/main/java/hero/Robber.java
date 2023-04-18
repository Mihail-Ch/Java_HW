package hero;

public class Robber extends BaseHero {

    public Robber(boolean team, int[] damag, int health, int healthMax) {
        super(team, damag, health, healthMax);
    }

    @Override
    public String GetInfo() {

        return "Привет я -Вор-, мое имя";
    }
}
