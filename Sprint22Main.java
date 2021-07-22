import java.util.Scanner;

public class Sprint22Main {
    public static void main(String[] args) {
        // I: Create a scanner, point to the system input
        Scanner s = new Scanner(System.in);

        // II: Capture a string
        System.out.print("What's your name? ");
        String name = s.next();
        System.out.printf("Hey there, %s! \n", name);

        // III: Capture an integer
        System.out.print("How many do you wish to buy? ");
        int qty = s.nextInt();
        System.out.printf("Buying %d items \n", qty);

        // IV: Capture a decimal
        System.out.print("What is the price? ");
        double price = s.nextDouble();
        System.out.printf("The item costs $%.2f. \n", price);

        // Wrap up
        System.out.printf("%s bought %d items for $%.2f each, totaling $%.2f \n", name, qty, price, qty * price);
    }
}