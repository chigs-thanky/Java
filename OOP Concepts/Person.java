
public class Person {

    private String name;
    private int BDate;
    private String lName;

//Getter (Read) the name
    public String getName() {
        return name;
    }

    public int getBDate() {
        return BDate;
    }

    public String getlName() {
        return lName;
    }
//Setter (Write/Set) the name

    public void setName(String myName) {
        this.name = myName;
    }

    public void setDate(int myBDate) {
        this.BDate = myBDate;
    }

    public void setName1(String lName) {
        this.lName = lName;
    }
}
