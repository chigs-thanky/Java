// Create a Main class

class Main {

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void fullBrake(int friction) {
        System.out.println("Brake Applied with force: " + friction + " KGs");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public void name(String nickname, String lname) {
        System.out.println("Name is: " + nickname + " " + lname);
    }

    // Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        Main myCar = new Main();     // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200); // Call the speed() method
        myCar.fullBrake(10);
        myCar.name("Chirag", "Thanky");
        myCar.name("Max", "Christian");

    }
}
