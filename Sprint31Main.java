public class Sprint31Main {

    public static void main(String[] args) {
        // Basic example
        int result;
        boolean test = false;

        if (test) {
            result = 1;
        } else {
            result = 0;
        }

        System.out.println("The result is " + result);

        result = test ? 1 : 0;

        System.out.println("The result is " + result);

        // Logic operator example

        int value = 5;
        String msg;

        if (value < 5) {
            msg = "Value is less than 5";
        } else {
            msg = "Value is not less than 5";
        }

        System.out.println(msg);

        msg = (value < 5) ? "Value is less than 5" : "Value is not less than 5";
        System.out.println(msg);

        // Inline example

        System.out.println((value < 5) ? "Value is less than 5" : "Value is not less than 5");
    }
}

/* Output
The result is 0
The result is 0
Value is not less than 5
Value is not less than 5
Value is not less than 5
*/