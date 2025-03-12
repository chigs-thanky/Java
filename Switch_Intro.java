public class Switch_Intro {
  public static void main(String[] args) {
    // int day = 4;
    String light = "Hit";
    switch (light) {
      case "RED":
        System.out.println("Stop!");
        break;
      case "GREEN":
        System.out.println("Go!");
        break;
      case "YELLOW":
        System.out.println("Wait!");
        break;
      default:
        System.out.println("Invalid Input");

    }
  }
}