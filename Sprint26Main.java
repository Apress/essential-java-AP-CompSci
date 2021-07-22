public class Sprint26Main {

    public static void main(String[] args) {
    // First example
        average(10,15,12); // 12.333333
    // Second example
        System.out.println(avgValue(10,15,12)); // 12.333333
    // Third example
        System.out.println(avgValue(10,15)); // 12.5
    // Fourth example
        System.out.println(intDiv(5,2)); // 2.5
    }
    public static void average(float val1, float val2, float val3)
    {
        float avg = val1 + val2 + val3;
        avg = avg / 3;
        System.out.println(avg);
    }
    public static float avgValue(float val1, float val2, float val3)
    {
        float avg = val1 + val2 + val3;
        avg = avg / 3;
        return avg;
    }
    public static float avgValue(float val1, float val2)
    {
        float avg = val1 + val2;
        avg = avg / 2;
        return avg;
    }
    public static float intDiv(int val1, int val2)
    {
        float quot = (float)val1 / (float)val2;
        return quot;
    }
}