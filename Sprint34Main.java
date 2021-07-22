import java.util.InputMismatchException;
import java.util.Scanner;

public class Sprint34Main {

    // create an instance of the Scanner class
    public static Scanner sc;

    public static void main(String[] args) {
        // create the instance of the Scanner and
        // give it a name
        sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");

        // The try statement and the braces after it start a
        // code block that Java will attempt to run. It is a
        // safe area to run code and any errors that happen
        // will be captured.
        try {
            int intValue = sc.nextInt();
            System.out.printf("You entered %d.\n",intValue);
        } catch (Exception e) {
            // The catch statement and the code block after it
            // run when there is an error, also known as an
            // Exception. An exception can be of many types,
            // but when one is encountered, it is "thown" and
            // the catch statement catches it. If there are no
            // errors, the code in the catch block doesn't run.
            System.out.println("There was an error. Here is more info...");
            // The e variable that is part of the catch statement
            // contains information about the type of error. It is
            // the exception that is "caught" by the catch statement.
            // You can use the toString() method to display the
            // details of the error.
            System.out.println(e.toString());
        }

        // You can also capture specific exceptions. You can put multiple
        // catch statements with different exception types. If an error
        // is thrown, Java will run through the various catch statements
        // until it finds one that matches the type. Then it will run through
        // that and skip the rest of the catch statements.
        sc = new Scanner(System.in);
        System.out.print("Enter a short value (must be between -32,768 and 32,767): ");

        try {
            short shortValue = sc.nextShort();
            System.out.printf("You entered %d.\n", shortValue);
        } catch (InputMismatchException e) {
            System.out.println("The value is the wrong type. Maybe it is too big or small?");
        } catch (Exception e) {
            System.out.println("There was an error. Here is more info...");
            System.out.println(e.toString());
        } finally {
            // If you want to run code after a try block regardless if an error is caught,
            // you can add a finally statement and code block.
            System.out.println("Thank you for your answer!");
        }
    }
}

/* Output
Enter an integer value: 4.3
There was an error. Here is more info...
java.util.InputMismatchException
Enter a short value (must be between -32,768 and 32,767): 64000
The value is the wrong type. Maybe it is too big or small?
Thank you for your answer!
*/