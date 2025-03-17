
public class Method_with_If_Else {

    //Create a checkAge() method with an "int age" parameter
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access Denied, not old enough to enter");
        } else {
            System.out.println("Access Granted, old enough to go!");
        }
    }
    public static void main(String[] args) {
        checkAge(27);//Calling method "checkAge" and passing argument "27"
    }
}
