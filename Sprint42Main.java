public class Sprint42Main {

    public static void main(String[] args) {

        // Single loop
        System.out.println("Single loop");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Nested loop
        System.out.println("\nNested loop");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("(%d,%d)\n",i,j);
            }
        }

        // Building a grid
        System.out.println("\nBuilding a grid:");
        System.out.println("\t0:\t1:\t2:\t3:\t4:\t5:\t6:\t7:\t8:\t9:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d:\t",i);
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d\t",i*j);
            }
            System.out.print("\n");
        }
    }
}