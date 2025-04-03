
class Geometry { //Parent Class

    void geoFun() {
        System.out.println("Geomety is Fun!");
    }
}

class Square extends Geometry { //child class

    void areaSquare() {
        System.out.println("Area of square: l x l");
    }
}

class Rectangle extends Geometry { //child class

    void areaRectangle() {
        System.out.println("Area of Rectangle: l x b");
    }
}

class Circle extends Geometry { //child class

    void areaCircle() {
        System.out.println("Area of circle is: π x r x r");
    }
}

public class Inheritance_04 {

    public static void main(String[] args) {
        Square mySquare = new Square(); //Object "mySquare" created
        mySquare.geoFun();
        mySquare.areaSquare();

        System.err.println("\n");

        Rectangle myRectangle = new Rectangle(); //Object :myRectangle" created
        myRectangle.geoFun();
        myRectangle.areaRectangle();

        System.err.println("\n");

        Circle myCircle = new Circle(); //Object "mySquare" created
        myCircle.geoFun();
        myCircle.areaCircle();

    }
}
