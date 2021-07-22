public class Sprint37Main {

    public static void main(String[] args) {
        // This loop will run as long as the condition at the top
        // is always true

        int val = 0;

        while (val < 10) {
            System.out.println(String.format("val = %d",val));
            val++;
        }

        /* Output
        val = 0
        val = 1
        val = 2
        val = 3
        val = 4
        val = 5
        val = 6
        val = 7
        val = 8
        val = 9
         */
    }
}