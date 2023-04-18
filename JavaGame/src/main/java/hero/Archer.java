package hero;

public class Archer extends Shooter {

    private int arrows;
    private int accuracy;

    public int GetArrows() {
        return arrows;
    }

    public void SetArrows(int arrows) {
        this.arrows = arrows;
    }

    public int GetAccuracy() {
        return accuracy;
    }

    public void SetAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public Archer(boolean team) {
        super(true, new int[]{4, 8}, 75, 75, 20, 15);
        this.arrows = arrows;
        this.accuracy = accuracy;
    }

    @Override
    public String GetInfo() {
        return "Привет я -Лучник-, мое имя";
    }

    @Override
    public void Step() { }
}
