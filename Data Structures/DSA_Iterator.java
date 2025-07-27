
import java.util.ArrayList;
import java.util.Iterator;

public class DSA_Iterator {

    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //Make a collection
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(7);
        num.add(12);
        num.add(26);

        // Get the iterator
        Iterator<String> it = cars.iterator();

        //Get the iterator for integer
        Iterator<Integer> numIt = num.iterator();

        // Print the first item of String list
        System.out.println(it.next());
        // Print the first item of int list
        System.out.println(numIt.next());

        //for entire list/loop
        // while(it.hasNext()){
        // System.out.println(it.next());
        // }
        // while(numIt.hasNext()){
        // System.out.println(numIt.next());
        // }
    }
}
