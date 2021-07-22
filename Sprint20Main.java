public class Sprint20Main {
    public static void main(String[] args) {
        // NOTE: This code has errors in it and WILL NOT COMPILE
        // Setting variables for examples
        int a = 5;
        double b = 3.14;
        String x = "3.95";
        String y = "185";
        // I: Numbers in string concatenation
        String text = "The value of a is " + a;
        System.out.println(text);
        // II: Error in direct type conversion
        String val = b; // Can't convert types
        // III: Convert using the base value type's toString() method
        String rate = Double.toString(b);
        System.out.println(rate);
        // IV: Parse (Convert) a string to a number
        double piValue = Double.parseDouble(x);
        int qty = Integer.parseInt(y);
        double price = Double.parseDouble("$2.50"); // Generates an error
        // V: Casting values
        double foo = 3.00;
        int bar = foo; // No cast, generates an error
        int baz = (int) foo; // With cast
        // VI: Casting issues
        int value1 = 2, value2 = 5;
        float quotient;
        //// without casting:
        quotient = value2 / value1;
        System.out.println(quotient); // 2.0
        //// with improper casting:
        quotient = (float)(value2 / value1);
        System.out.println(quotient); // 2.0
        //// with proper casting:
        quotient = (float)value2 / (float)value1;
        System.out.println(quotient); // 2.5
    }
}