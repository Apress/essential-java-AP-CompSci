public class Sprint40Main {

    public static void main(String[] args) {

        int x = 10;

        System.out.println("Combined assignment");

        x += 5;     // 15
        System.out.println(x);

        x -= 5;     // 10
        System.out.println(x);

        x *= 2;     // 20
        System.out.println(x);

        x /= 4;     // 5
        System.out.println(x);

        x %= 2;     // 1
        System.out.println(x);

        System.out.println("\nInline combined assignment");

        int a = 1;
        System.out.println(a);      // 1
        System.out.println(a += 1); // 2
        System.out.println(a);      // 2

        System.out.println("\nPost increment");

        int b = 1;
        System.out.println(b);      // 1
        System.out.println(b++);    // 1
        System.out.println(b);      // 2

        System.out.println("\nPre increment");

        int c = 1;
        System.out.println(c);      // 1
        System.out.println(++c);    // 2
        System.out.println(c);      // 2
    }
}