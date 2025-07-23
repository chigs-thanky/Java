
import java.util.HashSet;

//HashSet is a unordered list with unique elements and doesn't allow duplicates
public class DSA_HashSet_Methods {

    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();

        //Add Elements -> add() method
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mahindra");
        cars.add("Porche");
        cars.add("BMW"); //Ignore this duplicate

        //contain("") method -> Check If an Element Exists
        Boolean check = cars.contains("BMW");
        System.out.println(check);                 //True because set contains BMW
        //OR you can directly print like follow:
        System.out.println(cars.contains("XUV")); //False because no "XUV" in set

        //Remove an Element -> remove() method
        cars.remove("Porche");

        //Remove all elements -> clear() method
        cars.clear();

        //Print Total Output
        System.out.println(cars);
    }
}
