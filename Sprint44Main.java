import java.util.Scanner;

public class Sprint44Main {

    public static void main(String[] args) {
        // Creating an array from values
        int[] a = new int[] {1,2,3,4,5};

        // Accessing values in an array
        System.out.println(a[0]);

        // Creating an array by size
        int[] b = new int[5];

        // Assigning values to an array
        b[0] = 5;

        // Errors with arrays
        // System.out.println(b[1]); // Returns a 0 since no value was assigned
        // b[5] = 9; // No index 5 exists
        // int[] c = new int[] {1.2,3.4,5.6}; // Doesn't match type
        // int[] d = new int[] {1,2,3,4.5}; // Mixed types

        // Getting the array length
        int len = a.length;
        System.out.println(len);

        // Looping through an array
        for (int i = 0; i < a.length; i++)
        {
            System.out.printf("Index %d: %d\n",i, a[i]);
        }

        // Defining an array using input
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to add? ");
        int count = sc.nextInt();

        int[] values = new int[count];

        for (int i = 0; i < values.length; i++)
        {
            System.out.printf("Value %d: ", i);
            int num = sc.nextInt();

            values[i] = num;
        }

        int sum = 0;
        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }

        System.out.printf("Sum: %d\n", sum);
    }
}