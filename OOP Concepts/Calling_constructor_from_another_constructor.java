
public class Calling_constructor_from_another_constructor {

    int modelYear;
    String modelName;

    // Constructor with one parameter
    public Calling_constructor_from_another_constructor(String modelName) {
        // public Calling_constructor_from_another_constructor(int modelYear) {
        // Call the two-parameter constructor to reuse code and set a default year    
        this(2020, modelName);
        // this(modelYear, "Maruti");
    }

    // Constructor with two parameters
    public Calling_constructor_from_another_constructor(int modelYear, String modelName) {
        // Use 'this' to assign values to the class variables
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    // Method to print car information
    public void printInfo() {
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args) {
        // Create a car with only model name (uses default year)
        Calling_constructor_from_another_constructor car1 = new Calling_constructor_from_another_constructor("Corvette");
        // Calling_constructor_from_another_constructor car1 = new Calling_constructor_from_another_constructor(2020);
        Calling_constructor_from_another_constructor truck = new Calling_constructor_from_another_constructor("TATA");

        Calling_constructor_from_another_constructor lambo = new Calling_constructor_from_another_constructor(2025, "Lamborghini Hurracan");

        // Create a car with both model year and name
        Calling_constructor_from_another_constructor car2 = new Calling_constructor_from_another_constructor(1969, "Mustang");
        // Calling_constructor_from_another_constructor car2 = new Calling_constructor_from_another_constructor(1969);

        Calling_constructor_from_another_constructor RollsRoyce = new Calling_constructor_from_another_constructor(2025, "Rolls Royce Phantom");

        car1.printInfo();
        car2.printInfo();
        truck.printInfo();
        RollsRoyce.printInfo();
        lambo.printInfo();
    }
}
