package org.example;
import java.util.*;

public class Main {

    static Scanner myScanner = new Scanner(System.in);

    static LinkedList<ArrayList<String>> contacts = new LinkedList<>();
    public static void main(String[] args) {
        getData();
        printContacts();

        Comparator<ArrayList<String>> comparatorAge = new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                if (Integer.parseInt(o1.get(3)) > Integer.parseInt(o2.get(3))) return 1;
                else if (Integer.parseInt(o1.get(3)) < Integer.parseInt(o2.get(3)))  return -1;
                else return 0;
            }
        };
        contacts.sort(comparatorAge);
        printContacts();

        Comparator<ArrayList<String>> comparatorGender = new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                if (o1.get(4).charAt(0) > o2.get(4).charAt(0)) return 1;
                else if (o1.get(4).charAt(0) < o2.get(4).charAt(0)) return -1;
                else return 0;
            }
        };
        contacts.sort(comparatorGender);
        printContacts();

    }

    private void sortedForAge() {

    }

    private static void getData() {
        String command;
        System.out.println("Input 1 for input new line\n" +
                "2 for finish input\n");

        command = myScanner.nextLine();
        while (command.equals("1")) {
            contacts.add(getRecord());
            System.out.println("Input 1 for input new line\n" +
                    "2 for finish input\n");
            command = myScanner.nextLine();
        }
    }

    private static void printContacts() {
        for (ArrayList<String> record:
                contacts
             ) {
            System.out.print(record.get(0));
            System.out.print(record.get(1).toUpperCase().charAt(0)+".");
            System.out.print(record.get(2).toUpperCase().charAt(0)+". ");
            System.out.print(record.get(3) + " ");
            System.out.println(record.get(4));

        }
    }

    private static ArrayList<String> getRecord () {
            ArrayList<String> newRecord = new ArrayList<>();
            System.out.println("Input lastName");
            String lastName = myScanner.nextLine();
            newRecord.add(lastName);
            System.out.println("Input firstName");
            String firstName = myScanner.nextLine();
            newRecord.add(firstName);
            System.out.println("Input secondName");
            String secondName = myScanner.nextLine();
            newRecord.add(secondName);
            System.out.println("Input dataBorn");
            String dataBorn = myScanner.nextLine();
            newRecord.add(dataBorn);
            System.out.println("Input gender");
            String gender = myScanner.nextLine();
            newRecord.add(gender);
            return newRecord;
        }

}