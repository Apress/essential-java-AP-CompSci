public class Sprint27Main {

    public static double myValue;
    public static double myOtherValue;
    public static void main(String[] args) {
    // This variable exists only in the main() method of the program
        myValue = 10.0;
        myOtherValue = 12.5;
        System.out.printf("myValue = %.2f and myOtherValue = %.2f.\n",myValue,myOtherValue);
        System.out.println("------------------ Starting method");
        myMethod(myValue,myOtherValue);
        System.out.println("------------------ Returning from method");
        System.out.printf("myValue = %.2f and myOtherValue = %.2f.\n",myValue,myOtherValue);
    // System.out.printf("value1 = %.2f and value2 = %.2f.\n",value1,value2);
    }
    public static void myMethod(double value1, double value2) {
    // Take the values coming into the method and change them
        System.out.printf("value1 = %.2f and value2 = %.2f.\n", value1,value2);
        value1 += 10.2;
        value2 += 5.5;
        System.out.printf("value1 = %.2f and value2 = %.2f.\n",value1,value2);
        System.out.printf("myValue = %.2f and myOtherValue = %.2f.\n",myValue,myOtherValue);
    // create a product
        double product = value1 * value2;
        System.out.println(String.format("The product is %.2f", product));
    }
}