public class Sprint17Main {
    public static void main(String[] args) {
    // I: Define a variable
    int quantity;
    double price;
    String name;
    char initial;

    // II: Assign a value to a variable using the assignment operator
    quantity = 5;
    price = 2.50;
    name = "Doug";
    initial = 'W';

    // III: Output a variable
    System.out.printf("%s %s. bought %d items priced at %f each\n",name,
    initial,quantity,price);

    /* Output
    Doug W. bought 5 items priced at 2.500000 each
    */

    // IV: Update value of a variable
    quantity = 10;
    price = 1.99;
    name = "Mike";
    initial = 'J';

    // V: Output updated variables
    System.out.printf("%s %s. bought %d items priced at $%.2f each\n",
    name,initial,quantity,price);

    /* Output
    Mike J. bought 10 items priced at $1.99 each
    */

    // VI: Initialize and assign on one line
    int myNumber = 5;
    
    // VII: Assign one variable to another
    int myValue = myNumber;
    }
}