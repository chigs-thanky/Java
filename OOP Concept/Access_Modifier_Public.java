
class Example {

    public int value = 12;

    public void show() {
        System.out.println("Public Method");
        // return 0;
    }
}

public class Access_Modifier_Public {

    public static void main(String[] args) {
        Example obj = new Example();
        // obj.value; Generating an Error
        // System.out.println(obj.value); //Does not make any sense
        int x = obj.value;
        System.out.println(x);
        obj.show();
    }
}
