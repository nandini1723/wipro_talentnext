package javafundamentals;

import java.util.Scanner;
import java.util.Arrays;

public class Question26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Need at least 2 elements.");
            return;
        }

        int[] arr = new int[n];

        // Input: elements of the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize variables
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        // Loop through array to find results
        for (int i = 0; i < n; i++) {
            int num = arr[i];

            // Find largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            // Find smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        // Display results
        System.out.println("Largest: " + largest);
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest number.");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }

        System.out.println("Smallest: " + smallest);
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No distinct second smallest number.");
        } else {
            System.out.println("Second Smallest: " + secondSmallest);
        }
    }
}
