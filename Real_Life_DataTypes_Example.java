public class Real_Life_DataTypes_Example {
    public static void main(String[] args) {
        //Define variables with DataTypes and assign values
        String studentName = "Chirag Thanki";
        String studentStream = "MSc. IT(Information Technology) & CA(Computer Applications)";
        int studentAge = 27;
        int studentID = 1;
        // float studentWeight = 65.50f;
        //Note: If you use float, then your should append f after decimal points to explicitly define floating-point literals.
        double studentWeight = 65.50;
        char studentGrade = 'A';

        //Print variables on screen
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Stream: " + studentStream);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Weight: " + studentWeight + "kg");
        System.out.println("Student Grade: " + studentGrade);
    }
}
