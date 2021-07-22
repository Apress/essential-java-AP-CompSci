public class Sprint46Main {

    public static void main(String[] args) {

        int[] values;
        int[][] grid;

//      values = new int[5];
//      grid = new int[5][5];

        values = new int[] {1,2,3,4,5};
        grid = new int[][] {{1,2,3,4,5},
                {2,3,4,5,6},
                {3,4,5,6,7},
                {4,5,6,7,8},
                {5,6,7,8,9}};

        values[3] = 0;
        grid[2][1] = 0;

        System.out.println("values element 3: " + values[3]);
        System.out.println("grid element 2, element 4: " + grid[2][4]);

        System.out.println("values in element 1: " + grid[1].length);
    }
}

/* Output
values element 3: 0
grid element 2, element 4: 7
values in element 1: 5
*/