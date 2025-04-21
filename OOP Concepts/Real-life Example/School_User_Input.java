
import java.util.Scanner;

class Student {

    String name;
    int age;

    void study() {
        System.out.println("\t-->" + name + " is studying.");
    }
}

class Teacher {

    String name;
    String subject;

    void teach() {
        System.out.println("\t-->" + name + " is teaching " + subject + " beautifully.");
    }
}

public class School_User_Input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student info
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student's age: ");
        int studentAge = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        // Get teacher info
        System.out.print("Enter teacher's name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Enter subject taught by the teacher: ");
        String subject = scanner.nextLine();

        // Create objects
        Student student = new Student();
        student.name = studentName;
        student.age = studentAge;

        Teacher teacher = new Teacher();
        teacher.name = teacherName;
        teacher.subject = subject;

        // Show actions
        System.out.println("\n--- Actions ---");
        student.study();
        teacher.teach();

        scanner.close();
    }
}
