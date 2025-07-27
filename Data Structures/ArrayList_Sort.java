
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sort {

    public static void main(String[] args) {

        //For Strings
        ArrayList<String> Athlete = new ArrayList<>();
        Athlete.add("Virat Kohli");
        Athlete.add("Cristiano Ronaldo");
        Athlete.add("Kylian Mbappe");
        Athlete.add("Usain Bolt");
        Athlete.add("Memphis Depay");
        Collections.sort(Athlete);
        System.out.println(Athlete);

        for (int i = 0; i < Athlete.size(); i++) {
            System.out.println(Athlete.get(i));
        }
        System.out.println("\n");

        //For Integer numbers
        ArrayList<Integer> Num = new ArrayList<>();
        Num.add(30);
        Num.add(5);
        Num.add(9);
        Num.add(7);
        Num.add(26);
        System.out.println("Insertion Order: " + Num); //In Insertion Order

        Collections.sort(Num); //Use Collections package to use sort() method
        System.out.println("After sorting Numeric Order: " + Num); //In Numeric Order

        System.out.println("\nLoop:");

        // To Print in Loop
        for (int i = 0; i < Num.size(); i++) {
            System.out.println(Num.get(i));
        }
    }
}
