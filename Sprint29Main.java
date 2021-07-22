public class Sprint29Main {

    public static void main(String[] args) {
        // Basic if example
        if (true) {
            // code here will always run
        }

        if (false) {
            // code here will never run
        }

        // Basic if...else example
        if (true) {
            // code here will always run
        } else {
            // code here will never run
        }

        if (false) {
            // code here will never run
        } else {
            // code here will always run
        }

        // Basic if, else if, else example
        int a = 5;

        if (a == 5) {
            // code here will run if the condition is true
            // then the entire if/else if/else block ends
        } else if (a == 4) {
            // code here will run if the second condition is true
            // then the rest of the if/elsef/else block ends
        } else {
            // code here will run if none of the previous conditions are true
        }

        // Complete examples

        int x = 5;
        if (x > 3) {
            disp("X is larger than 3");
        } else if (x > 1) {
            disp("X is larger than 1");
        } else {
            disp("X is not larger than 3 or 1");
        }

    }

    public static void disp(String msg) {
        System.out.println(msg);
    }
}

/* Output: X is larger than 3 */