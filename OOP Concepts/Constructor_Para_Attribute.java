
public class Constructor_Para_Attribute {

    int x;
    int r;

    public Constructor_Para_Attribute(int c) {
        x = c;
        r = c;
    }

    public static void main(String[] args) {
        Constructor_Para_Attribute myObj = new Constructor_Para_Attribute(5);
        System.out.println(myObj.x);
        Constructor_Para_Attribute myDate = new Constructor_Para_Attribute(12);
        System.out.println(myDate.r);
        Constructor_Para_Attribute myDate2 = new Constructor_Para_Attribute(26);
        System.out.println(myDate2.r);
        Constructor_Para_Attribute myDate3 = new Constructor_Para_Attribute(11);
        System.out.println(myDate3.r);
    }
}
