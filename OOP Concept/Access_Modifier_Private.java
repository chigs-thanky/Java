
class Example {

    private int secret = 42; //Class Attribute/Field/Variables

    private void display() {    //Class Method
        System.out.println("Private method");
    }

    //To access above two, we need to set public getters as below
    public int getSecret() {
        return secret;
        // public method to call private display() method
    }

    public void show() {
        display();
    }
}

public class Access_Modifier_Private {

    // private static int secret1 = 43;
    public static void main(String[] args) {
        Example exp = new Example();
        exp.getSecret();
        exp.show();
        // Above two line will generate an error because no access to private variables outside class

        // System.out.println(secret1); TO ACCESS THIS, YOU MUST DECLARE SECRET1 AS STATIC, OTHEWISE AN ERROR WILL BE GENERATED.
    }
}
