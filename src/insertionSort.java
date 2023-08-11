import java.util.Random;
import java.util.Scanner;

public class insertionSort {
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
        insertion(arr, elements);
        long endTime = System.nanoTime();

        System.out.println("\nSorted Array:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        executionTimeNano = endTime - startTime;
        System.out.println("Execution Time = " + executionTimeNano + " ns");

    }

    public static void insertion(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
