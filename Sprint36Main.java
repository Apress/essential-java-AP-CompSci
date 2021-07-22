public class Sprint36Main {

    public static void main(String[] args) {
        String a = "foo";
        int b = 5;
        double c = 1.25;
        String x = String.format("a: %s, b: %d, c: %.3f", a, b, c);
        System.out.println(x);
    }
}

/* Output: a: foo, b: 5, c: 1.250 */