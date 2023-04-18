package org.example;

import hero.*;

import java.util.ArrayList;

public class Storage {



    public ArrayList<BaseHero> LoadHeroOne() {
        ArrayList<BaseHero> heroes = new ArrayList<>();
            heroes.add(new Archer(true));
            heroes.add(new Spearman(true, new int[]{2,9}, 50,50));
            heroes.add(new Peasant(true, new int[]{2,9}, 50,50));
            heroes.add(new Robber(true, new int[]{2,9}, 50,50));
            heroes.add(new Mage(true, new int[]{2,9}, 50,50));
            heroes.add(new Monk(true, new int[]{2,9}, 50,50));
            heroes.add(new Crossbowman(true));
        return heroes;
    }

    public ArrayList<BaseHero> LoadHeroTwo() {
        ArrayList<BaseHero> heroes = new ArrayList<>();
        heroes.add(new Archer(true));
        heroes.add(new Spearman(true, new int[]{2,9}, 50,50));
        heroes.add(new Peasant(true, new int[]{2,9}, 50,50));
        heroes.add(new Robber(true, new int[]{2,9}, 50,50));
        heroes.add(new Mage(true, new int[]{2,9}, 50,50));
        heroes.add(new Monk(true, new int[]{2,9}, 50,50));
        heroes.add(new Crossbowman(true));
        return heroes;
    }

}
