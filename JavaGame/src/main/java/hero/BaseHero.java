package hero;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements GameInterface {

    enum Names {
        Святослав, Коловрат, Робин, Бобин, Кремень, Чернослив, Стратег, Бензопил, Кибернетик
    }

    protected static int count = 0;
    protected boolean team;
    protected static int lastFirstTeamX = 0;
    protected static int lastFirstTeamY = 0;

    protected static int lastSecondTeamX = 9;
    protected static int lastSecondTeamY = 0;
    public String name;
    protected int xPosition, yPosition;
    protected int[] damag;
    protected int health, healthMax;

    public BaseHero(int xPosition, int yPosition) {
        this.coord = new Coord(xPosition, yPosition);

    }


    public BaseHero(boolean team, int[] damag, int health, int healthMax) {
        this.team = team;
        if (team) {
            this.xPosition = lastFirstTeamX;
            this.yPosition = lastFirstTeamY++;
        } else {
            this.xPosition = lastSecondTeamX;
            this.yPosition = lastSecondTeamY++;
        }
        this.damag = damag;
        this.health = health;
        this.healthMax = healthMax;
        name = GetName();
    }


    protected String GetName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    @Override
    public String GetInfo() {
        return " ";
    }

    protected void Shoot() {
        System.out.println("Shoot!");
    }

    @Override
    public void Step() {
        if (health <= 0 || arrows <= 0) return;

        Shoot();
    }

    //расчитываем расстояние до героя
    protected BaseHero findClosestEnemy(ArrayList<BaseHero> enemyTeam) {
        BaseHero closedEnemy = enemyTeam.get(0);
        double distance = Math.sqrt(Math.pow(enemyTeam.get(0).xPosition - this.xPosition, 2) + Math.pow(enemyTeam.get(0).yPosition - this.yPosition, 2));
        double minDistance = 0;
        for (BaseHero enemy : enemyTeam) {
            distance = Math.sqrt(Math.pow(enemy.xPosition - this.xPosition, 2) + Math.pow(enemy.yPosition - this.yPosition, 2));
            if(minDistance > distance) {
                minDistance = distance;
                closedEnemy = enemy;
            }
        }
        return closedEnemy;
    }

    protected Coord coord;

    protected static class Coord {
        private int x;
        private int y;
        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public void setX(int x) {
            this.x = x;
        }
        public int getY() {
            return y;
        }
        public void setY(int y) {
            this.y = y;
        }
    }
}
