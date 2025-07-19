
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
        capitalCity.put("England", "London"); //Ignores this line
        capitalCity.put("UK", "London"); //Allowed because key is different, value is same, so same value is allowed, but same key overrides with previous value.
        System.out.println(capitalCity);

        //NOTE: IF YOU WANT OUTPUT BY CODE LINE-BY-LINE, YOU CAN USE "LinkedHashMap" instead of HashMap
    }
}
