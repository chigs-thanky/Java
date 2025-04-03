// Abstract class

abstract class Animal {
    // Abstract method (does not have a body)

    public abstract void animalSound();
    // Regular method

    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {

    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {

    public void animalSound() {
        System.out.println("The Dog says: Bow Wow");
    }
}

class Inner_Outer_Class_02 {

    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
        System.out.println("\n");
        Dog myDog = new Dog(); //Create a Dog object
        myDog.sleep();
        myDog.animalSound();

    }
}
