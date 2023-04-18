package org.example;

import hero.*;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    static ArrayList<BaseHero> whiteArm = new Storage().LoadHeroOne();
    static ArrayList<BaseHero> blackArm = new Storage().LoadHeroTwo();


    public static void main(String[] args) {
        System.out.println("     БЕЛАЯ АРМИЯ:");
        whiteArm.forEach((n) -> System.out.println(n.GetInfo() + " " + n.name));
        System.out.println("------------");
        System.out.println("     ЧЕРНАЯ АРМИЯ:");
        blackArm.forEach((n) -> System.out.println(n.GetInfo() + " " + n.name));
    }

    SpellBook spellBook = SpellBook.values()[new Random().nextInt()];

}