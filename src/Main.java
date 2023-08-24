import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        ArrayList<Long> executionTimeNano = new ArrayList<>();
        ArrayList<Integer> elements = new ArrayList<>();

        System.out.println("Select Sorting Algorithm");
        System.out.println("1. Selection Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
        int selectedAlgorithm = sc.nextInt();

        switch (selectedAlgorithm) {
            case 1 -> {
                while (true) {
                    try {
                        n++;
                        System.out.print("\nArray " + n + " > ");
                        selectionSort.main(null);
                        executionTimeNano.add(selectionSort.executionTimeNano);
                        elements.add(selectionSort.elements);
                    } catch (Exception e) {
                        break;
                    }
                }
            }
            case 2 -> {
                while (true) {
                    try {
                        n++;
                        System.out.print("\nArray " + n + " > ");
                        bubbleSort.main(null);
                        executionTimeNano.add(bubbleSort.executionTimeNano);
                        elements.add(bubbleSort.elements);
                    } catch (Exception e) {
                        break;
                    }
                }
            }
            case 3 -> {
                while (true) {
                    try {
                        n++;
                        System.out.print("\nArray " + n + " > ");
                        insertionSort.main(null);
                        executionTimeNano.add(insertionSort.executionTimeNano);
                        elements.add(insertionSort.elements);
                    } catch (Exception e) {
                        break;
                    }
                }
            }
            case 4 -> {
                while (true) {
                    try {
                        n++;
                        System.out.print("\nArray " + n + " > ");
                        mergeSort.main(null);
                        executionTimeNano.add(mergeSort.executionTimeNano);
                        elements.add(mergeSort.elements);
                    } catch (Exception e) {
                        break;
                    }
                }
            }
            case 5 -> {
                while (true) {
                    try {
                        n++;
                        System.out.print("\nArray " + n + " > ");
                        quickSort.main(null);
                        executionTimeNano.add(quickSort.executionTimeNano);
                        elements.add(quickSort.elements);
                    } catch (Exception e) {
                        break;
                    }
                }
            }
        }


        System.out.println("\nExecution Time List");
        for (int i = 0; i < n - 1; i++) {
            System.out.println("(Array-" + (i + 1) + ", Elements-" + elements.get(i) + ")" + "\tExecution Time = " + executionTimeNano.get(i) + " ns, " + executionTimeNano.get(i) / 1000000 + " ms");
        }
    }
}
