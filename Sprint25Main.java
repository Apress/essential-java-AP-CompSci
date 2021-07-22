public class Sprint25Main {

    public static void main(String[] args) {
        outMethod();
        System.out.println();
        inMethod();
    }
    public static void outMethod() {
        System.out.println("Outer Method");
        inMethod();
    }
    public static void inMethod() {
        System.out.println("Inner Method");
    }
    public static void infiniteMethod() {
        System.out.println("This goes on forever!");
        infiniteMethod();
    }
}