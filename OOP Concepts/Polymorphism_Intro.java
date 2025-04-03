
class Animal {

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {

    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {

    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Human extends Animal {

    public void animalSound() {
        System.out.println("The human says: Hello Hi");
    }
}

class Polymorphism_Intro {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        Animal myHuman = new Human();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myHuman.animalSound();
    }
}
