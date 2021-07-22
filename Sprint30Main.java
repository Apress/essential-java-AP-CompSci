import java.util.Scanner;

public class Sprint30Main {

    public static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        displayMenu();

        // The charAt() method extracts the first character of a string.
        // This is an example of chaining statements together.
        char selection = sc.next().charAt(0);

        processSelection(selection);
    }

    public static void displayMenu() {
        System.out.println("Main Menu");
        System.out.println("==================");
        System.out.println("A: Display Greeting");
        System.out.println("B: Display Compliment");
        System.out.println("C: Display Farewell");
        System.out.println("==================");
        System.out.print("Command? ");
    }

    public static void processSelection(char selection) {
        String output;
        switch (selection) {
            case 'A':
            case 'a':
                output = "Hello there!";
                break;
            case 'B':
            case 'b':
                output = "You look great today!";
                break;
            case 'C':
            case 'c':
                output = "See you soon!";
                break;
            default:
                output = "Invalid command";
                break;
        }

        System.out.println(output);
    }
}