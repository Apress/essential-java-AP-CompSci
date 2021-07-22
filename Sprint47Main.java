public class Sprint47Main {

    public static void main(String[] args) {

        int[][] multitable = new int[10][10];

        for (int row = 0; row < multitable.length; row++) {
            for (int col = 0; col < multitable[row].length; col++) {
                multitable[row][col] = row*col;
            }
        }

        for (int row = 0; row < multitable.length; row++) {
            for (int col = 0; col < multitable[row].length; col++) {
                System.out.print(multitable[row][col] + "\t");
            }
            System.out.println();
        }
    }
}