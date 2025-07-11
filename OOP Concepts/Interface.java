
interface Animal {

    public void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)

    public void myName(); // interface method (does not have a body)
}

class Pig implements Animal {

    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        System.out.println("Zzz");
    }

    public void myName() {
        System.out.println("Chigs");
    }
}

class Name implements Animal {

    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        System.out.println("Zzz");
    }

    public void myName() {
        System.out.println("Chigs");
    }
}

class Interface {

    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
        Name myName = new Name();
        myName.myName();
    }
}
