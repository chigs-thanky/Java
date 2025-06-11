
class OuterClass {

    int x = 10;

    class InnerClass {

        int y = 5;
    }
}

class OuterValue {

    int A = 50;

    class InnerValue {

        int B = 7;
    }
}

// public class Main { //Here, class name should be a file name
public class InnerClass_Intro {

    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);

        OuterValue valueOut = new OuterValue();

        OuterValue.InnerValue valueIn = valueOut.new InnerValue();
        System.out.println(valueOut.A + valueIn.B);
        System.out.println(valueOut.A * valueIn.B);
    }
}
