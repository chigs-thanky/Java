
import java.util.LinkedList; //Import LinkedList Class

public class LinkedList_Methods {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Suzuki");
        cars.add("Buggati");
        cars.add("Aston Martin");

        //LinkedList Methods
        cars.addFirst("Jeep"); //Adds an element to the beginning of the list
        cars.addLast("Tesla"); //Add an element to the end of the list
        cars.removeFirst(); //Remove an element from the beginning of the list
        cars.removeLast(); //Remove an element from the end of the list

        System.out.println(cars);
        System.out.println(cars.getFirst()); //Get the element at the beginning of the list
        System.out.println(cars.getLast()); //Get the element at the end of the list
    }
}
