import java.util.ArrayList;

public class Sprint48Main {

    public static void main(String[] args) {

        // Define an ArrayList
        ArrayList names = new ArrayList();

        // Add items
        names.add("Doug");
        names.add("Mike");
        names.add("Janet");
        names.add("Matt");

        // Get items
        System.out.println(names.get(1)); // Outputs "Mike"

        // Error due to type mismatch
        //String myName = names.get(0);

        // Working around the Object type with ArrayLists
        String myName = names.get(0).toString();
        System.out.println(myName);

        // Display all items
        System.out.println(names);

        // Remove item
        names.remove(2);
        System.out.println(names);

        // Find index of item by value
        System.out.println(names.indexOf("Mike"));

        // Combine multiple methods together
        names.remove(names.indexOf("Mike"));
        System.out.println(names);

        // Replacing an item
        //names.set(1,"Sarah");
        names.set(names.indexOf("Matt"),"Sarah");
        System.out.println(names);

        // Get size, or number of items
        System.out.println(names.size());

        // Copy all values to new list
        ArrayList newNames = new ArrayList();
        newNames.addAll(names);
        System.out.println(names);
        System.out.println(newNames);

        // Clear all items
        names.clear();
        System.out.println(names.size());
    }
}

/* Output:
Mike
Doug
[Doug, Mike, Janet, Matt]
[Doug, Mike, Matt]
1
[Doug, Matt]
[Doug, Sarah]
2
[Doug, Sarah]
[Doug, Sarah]
0
*/