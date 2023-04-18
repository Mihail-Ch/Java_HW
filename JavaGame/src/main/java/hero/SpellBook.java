package hero;

public enum SpellBook {

    healOne(1,-1), healFive(2,-5), healTen(3,-10),
    damageOne(1,1), damageFive(5,2), damageTen(10,3),
    ressurect(25, Float.NaN);

    private final float power, cost;

    SpellBook(float power, float cost) {
        this.power = power;
        this.cost = cost;
    }

    public float GetPower() {return power;}
    public float GetCost() {return cost;}

    //
}
