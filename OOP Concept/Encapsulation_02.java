// Encapsulation (Hiding Data) - Protects data using private variables and public methods.

class Person {

    private String name; //private variable (Attribute)
    private int date;  //private variable (Attribute)

    public void setName(String gotName) { //setter
        name = gotName;
    }

    public void setDate(int Date) { //Setter
        date = Date;
    }

    public String getName() { //getter
        return name;
    }

    public int getDate() { //getter
        return date;
    }
}

public class Encapsulation_02 {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Ram");
        System.out.println(p.getName());
        p.setDate(12);
        System.out.println(p.getDate());
    }
}
