public class Sprint45Main {

    public static void main(String[] args) {

        // Splitting a delimited string into an array

        String list = "Doug,Mike,Janet,Matt,Tim,Doris";
        String[] names = list.split(",");

        System.out.printf("List: %s\n\n", list);

        System.out.printf("Item 2: %s\n\n",names[2]);

        for (var i = 0; i < names.length; i++)
            System.out.printf("Name %d: %s\n",i,names[i]);

        // Splitting a delimited string into an integer array

        String nums = "3,6,9,12,15,18,21";
        String strValues[] = nums.split(",");
        int[] values = new int[strValues.length];

        for (int i = 0; i < strValues.length; i++)
            values[i] = Integer.parseInt(strValues[i]);

        for (int i = 0; i < values.length; i++)
            System.out.printf("Value %d: %d\n",i,values[i]);

    }
}