package javafundamentals;

public class Question35 {
    public static void main(String[] args) {
        // Validate the number of arguments
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        int[][] arr = new int[3][3];
        int index = 0;
        int max = Integer.MIN_VALUE;

        // Fill the 2D array and find the maximum
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                try {
                    arr[i][j] = Integer.parseInt(args[index]);
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }
                    index++;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter valid integer numbers");
                    return;
                }
            }
        }

        // Print the array
        System.out.println("The given array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Print the biggest number
        System.out.println("The biggest number in the given array is " + max);
    }
}
