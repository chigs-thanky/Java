//This is a simple example of the use of For-Each Loop

public class For_Each_Loop {

    public static void main(String[] args) {
        System.out.println("\nFruits:");
        String[] fruits = {"Apple", "Banana", "Mango", "Watermelon"};

        //For Loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println("\nTeachers:");
        String[] teachers = {"Chirag", "Vishal", "Kandhal", "Satyam", "Punit"};

        //For-Each Loop
        for (String list : teachers) {
            System.out.println(list);
        }
    }
}
