package week5;

import week4.AbstractSort;

public class MergeSort extends AbstractSort {

    /* Merge sort algorithm (public invocation) */
    public static void sort(int[] elements) {
        int[] aux = new int[elements.length];                   // 1
        sort(elements, aux, 0, elements.length - 1);  // 2
    }

    /* Recursive merge sort logic */
    private static void sort(int[] elements, int[] aux, int low, int high) {
        if (high <= low) {                              // 1
            return;                                     // 1
        }

        int mid = low + (high - low) / 2;               // 2
        sort(elements, aux, low, mid);                  // 3
        sort(elements, aux, mid + 1, high);         // 3
        merge(elements, aux, low, mid, high);           // 4
    }

    /* Merge the two sorted sub-arrays into a larger sorted (sub)array */
    private static void merge(int[] elements, int[] aux, int low, int mid, int high) {
        for (int k = low; k <= high; k++) {             // 1
            aux[k] = elements[k];                       // 1
        }

        int i = low;                                    // 2
        int j = mid + 1;                                // 2
        for (int k = low; k <= high; k++) {             // 3
            if (i > mid) {                              // 4
                elements[k] = aux[j++];                 // 4
            } else if (j > high) {                      // 5
                elements[k] = aux[i++];                 // 5
            } else if (less(aux[j], aux[i])) {          // 6
                elements[k] = aux[j++];                 // 6
            } else {                                    // 7
                elements[k] = aux[i++];                 // 7
            }
        }
    }
}