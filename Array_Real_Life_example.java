
public class Array_Real_Life_example {

    public static void main(String[] args) {
        // An array for storing ages
        int age[] = {12, 26, 10, 11, 97, 20};
        System.out.println(age.length);

        // Get the length of the array
        int length = age.length;

        float avg, sum = 0;
        //Loop through the elements of array
        for (int i : age) {
            sum = sum + i; //Or you can write "sum=+i;"
        }

        avg = sum / length;
        System.out.println("The average is: " + avg);
    }
}
