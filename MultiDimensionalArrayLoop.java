
public class MultiDimensionalArrayLoop {

    public static void main(String[] args) {
        String[][] names = {{"Chirag", "Priya"}, {"Janki", "Poorvi", "Pratik"}};

        //Accessing elements of array
        System.out.println(names[1][2]);
        System.out.println(names.length);

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                // System.out.println("Outer loop: " + names.length);
                // System.out.println("Inner Loop: " + names[i].length);
                System.out.println("Name: " + names[i][j]);
            }
        }
    }
}
