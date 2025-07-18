
import java.util.HashMap; //Import the HashMap class

public class DSA_HashMap {

    public static void main(String[] args) {
        //Create a HashMap object called capitalCity
        HashMap<String, String> capitalCity = new HashMap<String, String>();

        //Add keys and values (Country, Capital)
        capitalCity.put("India", "Delhi");
        capitalCity.put("England", "London");
        capitalCity.put("Canada", "Ontario");
        capitalCity.put("USA", "Washington DC");
        capitalCity.put("Germany", "Berlin");
        System.out.println(capitalCity);

        //NOTE: IF YOU WANT OUTPUT BY CODE LINE-BY-LINE, YOU CAN USE "LinkedHashMap" instead of HashMap
    }
}
