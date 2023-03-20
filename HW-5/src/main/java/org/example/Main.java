package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        dataBase();
        getEmployees();
    }

    static HashMap<Integer, ArrayList<String>> employees = new HashMap<>();
    static Integer keyEmployee = 0;

    private static void dataBase() {
        addEmployees("Иван", "Иванов", createPhoneNumber());
        addEmployees("Светлана", "Петрова", createPhoneNumber());
        addEmployees("Кристина", "Белова", createPhoneNumber());
        addEmployees("Анна", "Мусина", createPhoneNumber());
        addEmployees("Иван", "Юрин", createPhoneNumber());
        addEmployees("Петр", "Лыков", createPhoneNumber());
        addEmployees("Павел", "Чернов", createPhoneNumber());
        addEmployees("Петр", "Чернышов", createPhoneNumber());
        addEmployees("Мария", "Федорова", createPhoneNumber());
        addEmployees("Марина", "Светлова", createPhoneNumber());
        addEmployees("Мария", "Савина", createPhoneNumber());
        addEmployees("Мария", "Рыкова", createPhoneNumber());
        addEmployees("Марина", "Лугова", createPhoneNumber());
        addEmployees("Анна", "Владимирова", createPhoneNumber());
        addEmployees("Иван", "Мечников", createPhoneNumber());
        addEmployees("Петр", "Петин", createPhoneNumber());
        addEmployees("Иван", "Ежов", createPhoneNumber());
    }

    private static void addEmployees(String firstName,
                                 String lastName,
                                 String phone) {
        keyEmployee += 1;
        ArrayList<String> empl = new ArrayList<>();
        empl.add(firstName);
        empl.add(lastName);
        empl.add(phone);
        employees.put(keyEmployee, empl);
    }

    private static String createPhoneNumber() {
        String number = "+7-9";
        Random random = new Random();
        int num = random.nextInt(99999999 - 11000000) + 11000000;
        String phoneNumber = Integer.toString(num);
        number += phoneNumber;
        return  number;
    }

    private static void getEmployees() {
        for (Integer key: employees.keySet()) {
            System.out.println(key + "=" +employees.get(key));
        }
    }

    private static void getPopularName(Integer id) {
       // String name = employees.get(id);
        // Не могу понять как получить такую строку на java, код ниже я писал на Swift
        
//        var name = employess[id]?[0].lastName
//        var popularName = 0
//        for (_, v) in employess {
//            for (n, _, _) in v {
//                if name == n {
//                    popularName += 1
//                }
//            }
//        }
//        print(name ?? " ", popularName)
    }

}