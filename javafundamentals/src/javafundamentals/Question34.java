package javafundamentals;
public class Question34 {
    public static void main(String[] args) {
        // Check if 4 integers are passed
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        int[] arr = new int[4];

        // Parse and validate integers
        for (int i = 0; i < 4; i++) {
            try {
                arr[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid integer numbers");
                return;
            }
        }

        // Print the original 2x2 matrix
        System.out.println("The given array is:");
        System.out.println(arr[0] + " " + arr[1]);
        System.out.println(arr[2] + " " + arr[3]);

        // Print the reversed 2x2 matrix
        System.out.println("The reverse of the array is:");
        System.out.println(arr[3] + " " + arr[2]);
        System.out.println(arr[1] + " " + arr[0]);
    }
}

