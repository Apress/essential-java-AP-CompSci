import java.util.Scanner;

public class Sprint38Main {

    public static Scanner sc;
    public static boolean loopProgram;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        loopProgram = true;

        displayMenu();

        while (loopProgram) {
            System.out.print("Command? ");
            String cmd = sc.next();
            parseCmd(cmd);
        }

    }

    public static void displayMenu() {
        System.out.println("Menu: ");
        System.out.println("north: move north ");
        System.out.println("south: move south ");
        System.out.println(" east: move east ");
        System.out.println(" west: move west ");
        System.out.println(" exit: quit program ");
    }

    public static void parseCmd(String cmd) {
        switch (cmd) {
            case "north":
                System.out.println("You move north.");
                break;
            case "south":
                System.out.println("You move south.");
                break;
            case "east":
                System.out.println("You move east.");
                break;
            case "west":
                System.out.println("You move west.");
                break;
            case "exit":
                System.out.println("Goodbye");
                loopProgram = false;
                break;
            default:
                System.out.println("Unrecognized command!");
                break;
        }
    }
}