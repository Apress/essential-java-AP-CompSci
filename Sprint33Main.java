public class Sprint33Main {

    public static void main(String[] args) {
        // Issue with == and strings
        // New strings that are built using literals
        String a = "CompSci";
        String b = "CompSci";

        // Result is true, because the references are identical
        boolean result = (a == b);
        System.out.println("The result of a == b is " + result);

        // New strings that are built as instances of a class
        String c = new String("CompSci");
        String d = new String("CompSci");

        // Result is false, because the the references are different
        result = (c == d);
        System.out.println("The result of c == d is " + result);

        // Result is true, because the values are identical
        result = c.equals(d);
        System.out.println("The result of c.equals(d) is " + result);

        // Result is true, because the values are identical
        result = c.equals("CompSci");
        System.out.println("The result of c.equals(\"CompSci\") is " + result);
    }
}

/* Output
The result of a == b is true
The result of c == d is false
The result of c.equals(d) is true
The result of c.equals("CompSci") is true
*/