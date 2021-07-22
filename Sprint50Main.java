import java.util.ArrayList;

public class Sprint50Main {

    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<Integer>();

        values.add(5);
        values.add(20);
        values.add(75);
        values.add(32);

        System.out.println(values.size()); // 4

        for (int i = 0; i < values.size(); i++) {
            System.out.printf("Value: %d\n",values.get(i));
        }

    }
}

/* Output:
4
Value: 5
Value: 20
Value: 75
Value: 32
 */
