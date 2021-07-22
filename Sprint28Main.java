public class Sprint28Main {
    public static void main(String[] args) {
        int a = 5;
        Boolean result;
        System.out.println("Basic operators");
        result = (a == 5); // Equality, result true
        display(result);
        result = (a != 5); // Inequality, result false
        display(result);
        result = (a > 5); // Greater than, result is false
        display(result);
        result = (a < 5); // Less than, result is false
        display(result);
        result = (a >= 5); // Greater than or equal to, result is true
        display(result);
        result = (a <= 5); // Less than or equal to, result is true
        display(result);
        System.out.println("Not operator");
        result = !result; // Not operator, true becomes false
        display(result);
        result = !true; // true becomes false
        display(result);
        result = !(a < 5); // false becomes true
        display(result);
        System.out.println("Evaluations and returned values");
        result = (5 + 5) > 10; // false
        display(result);
        result = getNumber() < .5; // true or false, depends on the value returned
        display(result);
        System.out.println("OR");
        result = true || true; // true
        display(result);
        result = true || false; // true
        display(result);
        result = false || true; // true
        display(result);
        result = false || false; // false
        display(result);
        result = (a < 5) || (a / 2 < 5); // true
        display(result);
        System.out.println("AND");
        result = true && true; // true
        display(result);
        result = true && false; // false
        display(result);
        result = false && true; // false
        display(result);
        result = false && false; // false
        display(result);
        result = (a < 5) && (a / 2 < 5); // false
        display(result);
    }
    public static void display(boolean result) {
        System.out.println("The result is " + result);
    }
    public static void display(double result) {
        System.out.println("The value is " + result);
    }
    public static double getNumber() {
        double rand = Math.random();
        display(rand);
        return rand;
    }
}