
import java.util.HashMap;

public class DSA_HashMap_Methods {

    public static void main(String[] args) {
        // create a HashMap object called studentID to combine int and string value
        HashMap<Integer, String> studentID = new HashMap<Integer, String>();

        //put() method to add elements
        //Adding keys and values
        studentID.put(1, "Manav");
        studentID.put(2, "Aarav");
        studentID.put(3, "Ruchit");
        studentID.put(4, "Ved");
        studentID.put(5, "Jenil");

        //To print whole output
        System.out.println(studentID);
        System.out.println("Size before removal: " + studentID.size());//To see HashMap size

        //To get (to access) specific element/object, use key, here It's an integer number, so to get Ved, we use int key 4 here.
        System.out.println(studentID.get(4));

        //To remove an object
        studentID.remove(2);

        System.out.println(studentID);
        System.out.println("Size after removal: " + studentID.size());//To see HashMap size after using remove() method

        //To remove all items, use clear() method
        //E.g. studentID.clear(); this will clear all objects
    }
}
