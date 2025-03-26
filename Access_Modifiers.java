
public class Access_Modifiers {

    // final int x = 10;
    int x = 10;
    // final double PI = 3.14;
    double PI = 3.14;

    public static void main(String[] args) {
        Access_Modifiers myObj = new Access_Modifiers();
        myObj.x = 50; // will generate an error
        myObj.PI = 25; // will generate an error
        System.out.println(myObj.x);
        System.out.println(myObj.PI);
    }
}
