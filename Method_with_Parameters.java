
public class Method_with_Parameters {

    static void weekDay(String day, int dayCount) {
        System.out.println("Today is " + day + " and number is " + dayCount);
    }

    static void birthDate(String name, String date) {
        System.out.println("Hey, " + name + "!, your birthdate is: " + date);
    }

    public static void main(String[] args) {
        weekDay("Sunday", 1);
        weekDay("Saturday", 7);
        birthDate("John", "18/10/1995");
    }
}
