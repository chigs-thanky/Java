
import java.util.LinkedHashMap; //Import LinkedHashMap class

public class DSA_LinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<String, String> countryCity = new LinkedHashMap<>();
        countryCity.put("India", "New Delhi");
        countryCity.put("Canada", "Toronto");
        countryCity.put("USA", "Los Angeles");
        countryCity.put("Australia", "Sydney");
        countryCity.put("Spain", "Madrid");
        countryCity.put("USA", "New York"); //Doesn't allow duplicate, duplicate key will be replaced with new value
        System.out.println(countryCity);

        //For better output, iterate using for-each loop
        for (String countryList : countryCity.keySet()) {
            System.out.println("Country: " + countryList + "\tCity: " + countryCity.get(countryList));
        }
    }
}
