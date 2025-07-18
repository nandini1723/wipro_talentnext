package javafundamentals;
import java.util.Scanner;
import java.util.Arrays;

public class Question30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Read array elements
        int[] nums = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Call method to rearrange and print
        evenOdd(nums);
    }

    public static void evenOdd(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++;
            } else if (nums[right] % 2 != 0) {
                right--;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        // Print rearranged array
        System.out.println("Reordered array (even first): " + Arrays.toString(nums));
    }
}