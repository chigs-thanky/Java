
class Student {

    String name;
    int age;

    void study() {
        System.out.println(name + " is studying.");
    }
}

class Teacher {

    String name;
    String subject;

    void teach() { //Function without parameters
        System.out.println(name + " is teaching " + subject + ".");
    }

    void learn(String name, String subject) { //Function with parameter
        System.out.println(name + " is teaching " + subject + ".");
    }
}

public class School {

    public static void main(String[] args) {
        // Create a student object
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 14;

        // Create a teacher object
        Teacher t1 = new Teacher();
        t1.name = "Mr. John";
        t1.subject = "Math";

        // Use methods (actions)
        s1.study();
        t1.teach();
        t1.learn("Dipak", "Math");
    }
}
