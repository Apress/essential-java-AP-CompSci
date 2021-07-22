import java.util.ArrayList;

public class Sprint49Main {

    public static void main(String[] args) {

        ArrayList values = new ArrayList();

        values.add(1);
        values.add(2);
        //values.add("3"); // Perfectly legal, but undesired
        values.add(4);

        System.out.println(values);

        int x = ((int) values.get(2)) / 2; // Cast required since Object is returned

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        //numbers.add("3"); // Generates an error
        numbers.add(4);

        int y = ((int) values.get(2)) / 2;

        // Create a new array
        int[] set = new int[] {1,2,3,4,5};
        // Convert that array to an ArrayList<Integer>
        ArrayList<Integer> newSet = convert(set);
    }

    public static ArrayList<Integer> convert(int[] data) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < data.length; i++) {
            list.add(data[i]);
        }

        System.out.println(list);

        return list;
    }
}