// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  public abstract void myName();
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
  public void  myName(){
  	System.out.println("Chigs");
  	}
}

class Abstraction {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
    myPig.myName();
  }
}
