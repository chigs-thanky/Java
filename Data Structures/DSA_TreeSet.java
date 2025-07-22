// Note: If you want to sort strings that inserted in an alphabetical order,use TreeSet class

// import treeSet class
import java.util.TreeSet;

public class DSA_TreeSet {

    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<String>();
        names.add("Dipak");
        names.add("Chirag");
        names.add("Vishal");
        names.add("Vatsal");
        names.add("Mayur");
        names.add("Ravi");
        names.add("Punit");
        System.out.println(names);
    }
}
