
public class Constructor_Multi_Para {

    int Launchyear;
    String modelName;

    public Constructor_Multi_Para(int year, String model) {
        Launchyear = year;
        modelName = model;
    }

    public static void main(String[] args) {
        Constructor_Multi_Para myObj = new Constructor_Multi_Para(2025, "Honda Activa");
        Constructor_Multi_Para myObj2 = new Constructor_Multi_Para(2025, "Ather 450x");
        Constructor_Multi_Para myObj3 = new Constructor_Multi_Para(2025, "TVS iQube");
        System.out.println(myObj.Launchyear + " - " + myObj.modelName);
        System.out.println(myObj.Launchyear + " - " + myObj2.modelName);
        System.out.println(myObj.Launchyear + " - " + myObj3.modelName);
    }
}
