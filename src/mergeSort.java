import java.util.Random;
import java.util.Scanner;

public class mergeSort {
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
        MergeSort(arr, 0, elements);

        System.out.println("\nSorted Array:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void MergeSort(int[] arr, int p, int r) {
        if (p < r) {

            int q = (int) (double) ((p + r) / 2);
            MergeSort(arr, p, q);
            MergeSort(arr, (q + 1), r);
            merge(arr, p, q, r);
        }
    }

    public static void merge(int[] arr, int p, int q, int r) {
        int n1 = q - p;
        int n2 = r - q - 1;

        int infinite = 2147483647;

        int[] left = new int[(n1 + 2)];
        int[] right = new int[(n2 + 2)];

        for (int i = 0; i <= n1; i++) {
            left[i] = arr[p + i];
        }
        for (int i = 0; i <= n2; i++) {
            right[i] = arr[q + i];
        }

        left[(n1 + 1)] = infinite;
        right[(n2 + 1)] = infinite;

        int i = 0, j = 0;
        for (int k = p; k < r; k++) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
        }
    }
}