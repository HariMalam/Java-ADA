import java.util.Random;
import java.util.Scanner;

public class bubbleSort {
    public static long executionTimeNano;
    public static int elements;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of elements :");
        elements = sc.nextInt();

        int[] arr = new int[elements];

        for (int i = 0; i < elements; i++) {
            arr[i] = random.nextInt(100000);
        }

        System.out.println("Array :");
        for (int element: arr){
            System.out.print(element+" ");
        }

        long startTime = System.nanoTime();
        bubble(arr, elements);
        long endTime = System.nanoTime();

        System.out.println("\nSorted Array:");
        for (int element: arr){
            System.out.print(element+" ");
        }
        System.out.println();

        executionTimeNano = endTime - startTime;
        System.out.println("Execution Time = " + executionTimeNano + " ns");
    }

    public static void bubble(int[] arr, int n) {
        int last = n;
        for (int i = 0; i < n; i++) {
            int exchange = 0;
            for (int j = 0; j < last - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    exchange++;
                }
            }
            if (exchange == 0) {
                return;
            } else {
                last--;
            }
        }
    }
}
