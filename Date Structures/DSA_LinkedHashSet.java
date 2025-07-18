//Import the HashSet class

import java.util.LinkedHashSet;
//The LinkedHashSet class gives output in insertion format means the order is maintained as data is entered line-by-line.

public class DSA_LinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> company = new LinkedHashSet<String>();
        company.add("Microsoft");
        company.add("Samsung");
        company.add("Dell");
        company.add("Intel");
        company.add("Nvidia");
        System.out.println(company);
    }

}
