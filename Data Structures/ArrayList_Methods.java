/* 
Following Methods are used: 
add()	Adds an element to the end of the list
get()	Returns the element at the specified position
set()	Replaces the element at the specified position
remove()	Removes the element at the specified position
size()	Returns the number of elements in the list
 */

import java.util.ArrayList; //Import ArrayList class

public class ArrayList_Methods {

    public static void main(String[] args) {
        ArrayList<String> Teachers = new ArrayList<>();
        Teachers.add("Chirag Sir");
        Teachers.add("Mayur Sir");
        Teachers.add("Akshay Sir");
        Teachers.add("Kandhal Sir");
        Teachers.add("Vishal Sir");
        Teachers.add("Vatsal Sir");
        Teachers.add("Punit Sir");
        System.out.println("Size: " + Teachers.size());
        System.out.println("All List: " + Teachers); //To get all ArrayList items
        System.out.println("Get: " + Teachers.get(3));
        Teachers.set(5, "Kana Sir"); //To replace an existing value with another
        System.out.println("Replaced: " + Teachers); //To get all ArrayList items
        Teachers.remove(4); //To remove particular value using index number
        System.out.println("Removed List: " + Teachers); //To get all ArrayList items
    }
}
