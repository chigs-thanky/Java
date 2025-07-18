//Import the HashSet class

import java.util.HashSet;

public class DSA_HashSet {

    public static void main(String[] args) {
        HashSet<String> company = new HashSet<String>();
        company.add("Microsoft");
        company.add("Samsung");
        company.add("Dell");
        company.add("Intel");
        company.add("Nvidia");
        company.add("Samsung");
        System.out.println(company);
    }

}
