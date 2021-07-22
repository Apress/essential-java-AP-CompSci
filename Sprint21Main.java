import java.util.Random;

public class Sprint21Main {
    public static void main(String[] args) {
        // I: Create random number generator
        Random rand = new Random();

        // II: Generate a number from 0 to 9
        int digit = rand.nextInt(10);
        System.out.printf("Random <10: %d \n", digit);

        // III: Roll a die
        int die = rand.nextInt(6) + 1;
        System.out.printf("Random die: %d \n", die);

        // IV: Generate a decimal from -5 to 5
        double max = 5;
        double min = -5;
        double decimal = rand.nextDouble() * (max - min) + min;
        System.out.printf("Random -5 > x < 5: %f \n", decimal);

        // V: Yahtzee Roll
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        int die3 = rand.nextInt(6) + 1;
        int die4 = rand.nextInt(6) + 1;
        int die5 = rand.nextInt(6) + 1;
        System.out.printf("Die 1: %d\tDie 2: %d\tDie 3: %d\tDie 4: %d\tDie 5: %d", die1, die2, die3, die4, die5);
    }
}