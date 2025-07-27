// Import the ArrayList class

import java.util.ArrayList;

public class DSA_ArrayList {

    public static void main(String[] args) {

        //ArrayList for "String";
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Mazda"); //Allows duplicates
        System.out.println(cars);

        /* Notworking, tried  
        ArrayList<String, String> cars = new ArrayList<String, String>();
        cars.add("Volvo", "X6");
        cars.add("BMW" , "X3");
        cars.add("Ford" , "Mustang");
        cars.add("Mazda" , "Swaraj");
        System.out.println(cars);
         */
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Ram Sir");
        teachers.add("Chirag Sir");
        teachers.add("Kana Sir");
        teachers.add("Mayur Sir");
        teachers.add("Vatsal Sir");
        System.out.println(teachers);

        //ArrayList for "Integers values"
        ArrayList<Integer> birthdates = new ArrayList<>();
        birthdates.add(45);
        birthdates.add(26);
        birthdates.add(13);
        birthdates.add(74);
        System.out.println(birthdates);

        //ArrayList for "decimal values"
        ArrayList<Double> myDecimal = new ArrayList<>();
        myDecimal.add(45.12);
        myDecimal.add(26.1);
        myDecimal.add(13.6);
        myDecimal.add(7.8);
        System.out.println(myDecimal);

        //ArrayList for "Single Character"
        ArrayList<Character> myChar = new ArrayList<>();
        myChar.add('A');
        myChar.add('B');
        myChar.add('C');
        myChar.add('D');
        System.out.println(myChar);
    }
}
