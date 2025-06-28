
class Vehicle {

    String brand = "Tata";

    void honk() {
        System.out.println("Horn OK Please!");
    }
}

class Car extends Vehicle {

    String model = "Altroz";
    int year = 2025;
}

public class Intro_Inheritance {

    public static void main(String[] args) {
        Car mycar = new Car();
        System.out.println(mycar.brand + " " + mycar.model + " " + mycar.year);
    }
}
