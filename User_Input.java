
import java.util.Scanner; //Import Scanner Class

public class User_Input { //This class name should match the file name, here ("User_Input.java")

    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in); //Create scanner object
        // System.out.println("Enter a Number: "); //To enter number on next line
        System.out.print("Enter a Number: "); //To enter number on same  line
        int num = myNum.nextInt(); //Read user input - nextInt() - for taking integer input, for string we have to use nextLine(), for double use nextDouble() 
        // System.out.println("\n" + num + "'s Table:\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(" " + num + " X " + i + " = " + num * i);
        }
    }
}
