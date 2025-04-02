
class Animal {  //Parent Class

    void makeSound() {
        System.out.println("Animal Class");
    }
}

class Cat extends Animal {  //Child Class

    void meow() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Bhow Bhow");
    }
}

public class Inheritance_03 {

    public static void main(String[] args) {
        Cat catSound = new Cat();
        catSound.meow();
        catSound.makeSound();
        // catSound.bark();
        // Dog.bark(); Can use if static  method is used (static bark(); instead of void bark();)
        Dog dogSound = new Dog();
        dogSound.bark();
    }
}
