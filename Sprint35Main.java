/** The Sprint35Main class defines the entire project
 *
 * @author Doug Winnie
 * @version 1.0
 */

public class Sprint35Main {

    /** integer variable that is used for calculations **/
    public static int val;

    /**
     * The main method executes automatically when the program launches
     * @param args [Not used] Holds launch arguments for the program
     */
    public static void main(String[] args) {
        val = 5;
        multiply(347, val);

    }

    /**
     * Calculates the product of two integers
     * @param a Integer for the first multiplier
     * @param b Integer for the second multiplyer
     * @return Integer value of the product of a and b
     */
    public static int multiply(int a, int b)
    {
        return a*b;
    }
}