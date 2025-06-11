
class OuterClass {

    int x = 10;

    class InnerClass {

        int y = 5;
    }
}

public class Inner_Outer_Class_Basic {

    public static void main(String[] args) {
        OuterClass hehe = new OuterClass();
        OuterClass.InnerClass myInner = hehe.new InnerClass();
        System.out.println("Outer Class X: "
                + hehe.x);
        System.out.println("Inner Class Y: " + myInner.y);
        System.out.println("X + Y: " + (hehe.x + myInner.y));
    }
}
