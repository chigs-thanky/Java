
interface fullName {

    public void firstName(); //interface method (Doesn't have a body)

    public void middleName();

    public void lastName();

}

class Name implements fullName {

    public void firstName() {
        System.out.println("\n-->\tChirag");
    }

    public void middleName() {
        System.out.println("\n-->\tJitendrakumar");
    }

    public void lastName() {
        System.out.println("\n-->\tThanki");
    }
}

class Interface2 {

    public static void main(String[] args) {
        Name myName = new Name();
        myName.firstName();
        myName.middleName();
        myName.lastName();
    }
}
