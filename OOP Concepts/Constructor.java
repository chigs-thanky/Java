
public class Constructor {

    int x;

    public Constructor(int num) {
        x = num;
    }

    public static void main(String[] args) {
        Constructor myObj = new Constructor(12);
        Constructor myObj2 = new Constructor(11);
        Constructor myObj3 = new Constructor(1997);
        System.out.println(myObj.x); // Output: 12
        System.out.println(myObj2.x);
        System.out.println(myObj3.x);
    }
}
