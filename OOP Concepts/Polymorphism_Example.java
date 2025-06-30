
class Car {

    public void carModel() {
        System.out.println("List of Car Brands with top models");
    }
}

class Tata extends Car {

    public void carModel() {
        System.out.println("Tata Altroz 2025");
    }
}

class Maruti extends Car {

    public void carModel() {
        System.out.println("Maruti swift 2025");
    }
}

class Punch extends Car {

    public void carModel() {
        System.out.println("Tata Punch 2025");
    }
}

class Mahindra extends Car {

    public void carModel() {
        System.out.println("Mahindra XUV 2025");
    }
}

class Polymorphism_Example {

    public static void main(String[] args) {
        Car myCar = new Car();
        Car myTata = new Tata();
        Car myMaruti = new Maruti();
        Car myMahindra = new Mahindra();
        Car myPunch = new Punch();
        myCar.carModel();
        myTata.carModel();
        myMaruti.carModel();
        myMahindra.carModel();
        myPunch.carModel();
    }
}
