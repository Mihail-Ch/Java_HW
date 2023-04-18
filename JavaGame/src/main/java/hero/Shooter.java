package hero;

public abstract class Shooter extends BaseHero {
    int accurance;
    int arrows;

    public Shooter(boolean team, int[] damag, int health, int healthMax, int accurance, int arrows) {
        super(team, damag, health, healthMax);
        this.accurance = accurance;
        this.arrows = arrows;
    }

    @Override
    public String GetInfo() {
        return "";
    }



    @Override
    public void Step() {

    }

}
