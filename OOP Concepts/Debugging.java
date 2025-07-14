
import java.util.Scanner;

public class Debugging {

    public static void main(String[] args) {
        System.out.print("Enter Name: "); //Use println if you want your output in the new line

        Scanner inputName = new Scanner(System.in); //Create scanner object "inputName"

        String Name = inputName.nextLine();
        // if (Name == "Chirag" || Name == "CHIRAG" || Name == "chirag") { //Not working in JAVA
        if (Name.equalsIgnoreCase("Chirag") || Name.equalsIgnoreCase("Dee")) {
            System.out.println("Good Luck!");
        } else {
            System.out.println("Better luck next time");
        }

        inputName.close(); //Good Practice: Close the scanner
    }
}
