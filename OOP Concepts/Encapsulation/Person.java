
public class Person {

    private String name;
    private int BDate;

//Getter (Read) the name
    public String getName() {
        return name;
    }

    public int getBDate() {
        return BDate;
    }
//Setter (Write/Set) the name

    public void setName(String myName) {
        this.name = myName;
    }

    public void setDate(int myBDate) {
        this.BDate = myBDate;
    }
}
