
class Car { //Class

    String brand = "Toyota"; //Attribute
    int speed = 120;        //Attribute
}

public class Class_and_Object {

    public static void main(String[] args) {
        Car myCar = new Car(); //Object named "myCar" created
        System.out.println(myCar.brand); //Output: Toyota
        System.out.println(myCar.speed + " km/h"); //Output: 120
    }
}
