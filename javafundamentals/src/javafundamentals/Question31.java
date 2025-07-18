package javafundamentals;
import java.util.Scanner;
import java.util.Arrays;

public class Question31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        // Read array elements
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Call the method
        withoutTen(nums);
    }

    public static void withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num!= 10) {
                result[index++] = num;
            }
        }

        // Print the modified array
        System.out.println("Array after removing 10s and shifting: " + Arrays.toString(result));
    }
}