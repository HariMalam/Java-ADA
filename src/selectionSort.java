import java.util.Random;
import java.util.Scanner;

public class selectionSort {
    public static long executionTimeNano;
    public static int elements;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of elements :");
        elements = sc.nextInt();

        int[] arr = new int[elements];

        for (int i = 0; i < elements; i++) {
            arr[i] = random.nextInt(1000000);
        }
        System.out.println("Array :");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        long startTime = System.nanoTime();
        selection(arr, elements);
        long endTime = System.nanoTime();

        System.out.println("\nSorted Array:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        executionTimeNano = endTime - startTime;
        System.out.println("Execution Time = " + executionTimeNano + " ns");

    }

    public static void selection(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
