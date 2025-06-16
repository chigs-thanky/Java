
public class JAVA_this_keyword {

    int x;

    public JAVA_this_keyword(int x) {
        this.x = x; // refers to the class variable x
    }

    public static void main(String[] args) {
        JAVA_this_keyword myObj = new JAVA_this_keyword(7); //Created one object with 7 as a parameter
        System.out.println("Value of X (for 1st Object): " + myObj.x);

        JAVA_this_keyword myObj2 = new JAVA_this_keyword(12); //Created 2nd object with 12 as a parameter
        System.out.println("Value of X (for 2nd Object): " + myObj2.x);
    }
}
