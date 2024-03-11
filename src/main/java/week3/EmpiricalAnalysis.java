package week3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class EmpiricalAnalysis {
    public static void main(String[] args) {
        int arraySize = 1000;
        // Change the algorithm ("linear" or "binary") and the number of elements
        int key = new Random().nextInt(arraySize * 10); // key to be found

        runAndMeasureSearchAlgorithm("linear", arraySize, key);
        runAndMeasureSearchAlgorithm("binary", arraySize, key);

        runAndMeasureSortAlgorithm("bubble", arraySize);
    }

    public static void runAndMeasureSearchAlgorithm(String algorithm, int arraySize, int key) {
        int[] elements = generateArray(arraySize);

        if (Objects.equals(algorithm, "binary")) {
            Arrays.sort(elements);
        }

        long start = System.currentTimeMillis(); // start measuring time
        int index;
        switch (algorithm) {
            case "linear":
                index = LinearSearch.search(elements, key);
                break;
            case "binary":
                index = BinarySearch.search(elements, key);
                break;
            default:
                System.out.println("Invalid algorithm selected. Use 'linear' or 'binary'.");
                return;
        }

        System.out.println("Element " + key + " was found at index: " + index);
        long timeElapsed = System.currentTimeMillis() - start;
        System.out.println("Elapsed time for " + algorithm + " search on " + arraySize + " elements: " + timeElapsed + " ms");
        System.out.println();
    }

    public static void runAndMeasureSortAlgorithm(String algorithm, int arraySize) {
        int[] elements = generateArray(arraySize);

        long start = System.currentTimeMillis(); // start measuring time
        int index;
        switch (algorithm) {
            case "bubble":
                BubbleSort.sort(elements);
                break;
            default:
                System.out.println("Invalid algorithm selected. Use 'bubble'.");
                return;
        }

        long timeElapsed = System.currentTimeMillis() - start;
        System.out.println("Elapsed time for " + algorithm + " sort on " + arraySize + " elements: " + timeElapsed + " ms");
    }

    /**
     * Generate an array of random integers with a given size.
     * @param size
     */
    public static int[] generateArray(int size) {
        int[] elements = new int[size];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = new Random().nextInt(size * 10);
        }

        return elements;
    }
}
