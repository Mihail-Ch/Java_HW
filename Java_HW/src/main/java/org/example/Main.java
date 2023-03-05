package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i -------
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа -------
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//Пункты реализовать в методе main
//*Пункты реализовать в разных методах

public class Main {

    static int i = 0;
    static int n = 0;

    static Integer[] m1 = new Integer[Short.MAX_VALUE];
    static Integer[] m2 = new Integer[Short.MAX_VALUE];

    static int randomElement() {
        Random random = new Random();
        return random.nextInt(0, 2000);
    }

    static int toBinary(int num) {
        int stringBinary = Integer.highestOneBit(num);
        return stringBinary;
    }

    static List<Integer> createArrayMin(int randomI, int num) {
        int[] mainArray = IntStream.rangeClosed(Short.MIN_VALUE, randomI).toArray();
        List<Integer> intermediary = new ArrayList<Integer>();
        for (int j = 0; j < mainArray.length; j++) {
            int number = mainArray[j];
            int res = Math.floorMod(number, num);
            if (res == 0) {
                intermediary.add(number);
            }
        }
        return intermediary;
    }

    static List<Integer> createArrayMax(int randomI, int num) {
        int[] mainArray = IntStream.rangeClosed(randomI, Short.MAX_VALUE).toArray();
        List<Integer> intermediary = new ArrayList<Integer>();
        for (int j = 0; j < mainArray.length; j++) {
            int number = mainArray[j];
            if (number % num == 0) {
                intermediary.add(number);
            }
        }
        return intermediary;
    }

    static void resulrArray(Integer[] arrMain, List<Integer> interm) {
        arrMain = interm.toArray(new Integer[]{interm.size()});
        for (int j = 0; j < arrMain.length; j++) {
            System.out.print(arrMain[j] + " ");
        }
    }
    public static void main(String[] args) {
        i = randomElement();
        n = toBinary(i);
        System.out.println(i);
        System.out.println(n);
        System.out.println("");
        resulrArray(m1, createArrayMax(i, n));
        System.out.println("");
        System.out.println("");
        resulrArray(m2, createArrayMin(i, n));
    }
}