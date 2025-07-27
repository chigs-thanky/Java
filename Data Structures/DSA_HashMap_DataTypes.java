
import java.util.HashMap; //Import HashMap class

public class DSA_HashMap_DataTypes {

    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        //Add keys and values (Name-String, Birthdate-Integer)
        people.put("Chirag", 30);
        people.put("Bunny", 17);
        people.put("Sid", 24);
        people.put("Daniel", 07);
        people.put("John", 19);
        System.out.println(people); //Output in one line
        // If you want output each values in separate rows, use for-each loop

        //Use keySet() to print key values
        for (String keys : people.keySet()) {
            System.out.println(keys);
        }
        //Use values() to print values of respective keys

        // for (String value : people.values()) { 
        //generate error as value is an int while you defined it as a String
        //Corrected code line
        for (int value : people.values()) {
            System.out.println(value);
        }

        //To print both keys and values in loop
        for (String key_value : people.keySet()) {
            System.out.println(key_value + ", " + people.get(key_value));
        }
        // To print both keys and values with extra info
        for (String key_value : people.keySet()) {
            System.out.println("Key: " + key_value + ", value: " + people.get(key_value));
        }
    }
}
