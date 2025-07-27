// Note: If you want to sort strings that inserted in an alphabetical order,use TreeSet class

// import treeSet class
import java.util.TreeSet;

public class DSA_TreeSet {

    public static void main(String[] args) {
        //For Strings (Natual Order)
        TreeSet<String> names = new TreeSet<>();
        names.add("Dipak");
        names.add("Chirag");
        names.add("Vishal");
        names.add("Vatsal");
        names.add("Mayur");
        names.add("Ravi");
        names.add("Punit");
        System.out.println(names);

        for (String Name : names) {
            System.out.println(Name);
        }

        //For numbers (Natural Order)
        TreeSet<Integer> myNum = new TreeSet<>();
        myNum.add(12);
        myNum.add(29);
        myNum.add(37);
        myNum.add(78);
        myNum.add(9);
        System.out.println(myNum);

        for (int i : myNum) {
            System.out.println(i);
        }

        //For floating numbers (Natural Order)
        TreeSet<Double> decimal = new TreeSet<>();
        decimal.add(3.14);
        decimal.add(1.9);
        decimal.add(7.4);
        decimal.add(2.5);
        System.out.println(decimal);

        //Loop through a TreeSet
        for (double d : decimal) {
            System.out.println(d);
        }

    }
}
