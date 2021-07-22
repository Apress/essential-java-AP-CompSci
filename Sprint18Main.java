public class Sprint18Main {
    public static void main(String[] args) {
    // I: Define and set values for examples
    int a = 2, b = 5, c = 100;
    float foo = 3.0f, bar = 10.5f, baz = 85.25f;

    // Integer Examples
    //
    // II: Addition
    int z = a + b; // 2 + 5 = 7
    System.out.printf("The sum is: %d\n",z);
    // Output: The sum is: 7

    // III: Subtraction
    int y = b - c; // 5 - 100 = -95
    System.out.printf("The difference is: %d\n",y);
    // Output: The difference is: -95

    // IV: Multiplication
    int w = a * c; // 2 * 100 = 200
    System.out.printf("The product is: %d\n", w);
    // Output: The product is: 200

    // V: Division
    int v = c / b; // 100 / 5 = 20
    System.out.printf("The quotient is: %d\n", v);
    // Output: The quotient is: 20

    // VI: Modulo
    int u = b % a; // 5 % 2 = 1
    System.out.printf("The remainder is: %d\n", u);
    // Output: The remainder is: 1

    // VII: Integer division
    int t = b / a; // (int)5 / 2 = 2
    System.out.printf("The integer quotient is: %d\n", t);
    // Output: The integer quotient is: 2

    // Float Examples
    //
    // VIII: Float Multiplication
    float qux = foo * bar; // 3.0f * 10.5f = 31.5f
    System.out.printf("The float product is: %f\n", qux);
    // Output: The float product is: 31.500000

    // IX: Float Division
    float quux = baz / bar; // 85.25f / 10.5f = 8.119047f
    System.out.printf("The float quotient is: %f\n", quux);
    // Output: The float quotient is: 8.119047

    // X: Integer to Float Division
    float quuz = b / a;
    System.out.printf("The quotient is: %f\n", quuz);
    // Generates a float, but based on the integer quotient
    // Output: The quotient is: 2.000000

    // XI: Order of operations
    int corge = 2 + 5 * 12 + 6 / 2;
    System.out.printf("The result is: %d\n", corge);
    // 2 + 60 + 6 / 2
    // 2 + 60 + 3
    // 62 + 3
    // 65
    // Output: The result is: 65
    int grault = (2 + 5) * (12 + 6) / 2;
    System.out.printf("The result is: %d\n", grault);
    // 7 * (12 + 6) / 2
    // 7 * 18 / 2
    // 126 / 2
    // 63
    // Output: The result is: 63

    // XII: String concatenation
    String garply = "Doug" + "Winnie";
    System.out.println(garply);
    // Output: DougWinnie
    garply = "Doug" + ' ' + "Winnie";
    System.out.println(garply);
    // Output: Doug Winnie
    
    // XIII: Concatenation literal
    System.out.println("The product of " + a + " and " + b + " is " +
    a*b + ".");
    // Output: The product of 2 and 5 is 10.
    }
}