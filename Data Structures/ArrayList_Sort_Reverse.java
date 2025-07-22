
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sort_Reverse {

    public static void main(String[] args) {
        //For Strings
        ArrayList<String> Athlete = new ArrayList<String>();
        Athlete.add("Virat Kohli");
        Athlete.add("Cristiano Ronaldo");
        Athlete.add("Kylian Mbappe");
        Athlete.add("Usain Bolt");
        Athlete.add("Memphis Depay");

        Collections.sort(Athlete, Collections.reverseOrder());
        System.out.println(Athlete);

        //For Integer numbers
        ArrayList<Integer> Num = new ArrayList<Integer>();
        Num.add(30);
        Num.add(5);
        Num.add(9);
        Num.add(7);
        Num.add(26);

        Collections.sort(Num, Collections.reverseOrder());
        System.out.println(Num);
    }
}
