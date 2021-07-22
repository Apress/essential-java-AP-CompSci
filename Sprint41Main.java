public class Sprint41Main {

    public static void main(String[] args) {

        int timesTrue = 0;
        int timesFalse = 0;
        int timesRun = 1000000;

        for (int i = 0; i <= timesRun; i++) {
            int result = (int)Math.round(Math.random());
            System.out.println(String.format("Attempt %d: %d", i, result));
            if (result == 0)
            {
                timesTrue++;
            } else {
                timesFalse++;
            }
        }

        float perTrue = (float) timesTrue / (float) timesRun * 100;
        float perFalse = (float) timesFalse / (float) timesRun * 100;

        System.out.println(String.format("Out of %d tests,",timesRun));
        System.out.println(String.format("Times true : %d, or %.2f",timesTrue, perTrue) + "%");
        System.out.println(String.format("Times false: %d, or %.2f",timesFalse, perFalse) + "%");

    }
}