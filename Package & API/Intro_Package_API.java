
import java.util.Scanner; // import the Scanner class 

class Intro_Package_API {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;
        int age;
        String initial;

        // Enter username and press Enter
        System.out.print("Enter username: "); //Takes input prompt in the same line
        // System.out.println("Enter username: "); //Takes input prompt in the new line
        userName = myObj.nextLine();

        //Enter age and press enter
        System.out.print("Enter the age: ");
        age = myObj.nextInt();

        //Enter initial and press enter
        System.out.print("Enter Initial: ");
        initial = myObj.next();

        System.out.println("Username is: " + userName);
        System.out.println("Age is: " + age);
        System.out.println("Initial is: " + initial);
    }
}
