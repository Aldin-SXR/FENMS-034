package week3;

public class BubbleSort {
    /* Swap marker; whether there was a swap in the inner loop */
    static boolean swapped;

    /* Perform the bubble sort algorithm */
    public static void sort(int[] elements) {
        for (int i = 0; i < elements.length; i++)  {                // 1
            swapped = false; // reset swap                          // 2

            for (int j = 1; j < elements.length - i; j++) {         // 3
                if (elements[j - 1] > elements[j]) {                // 4
                    swap(elements, j - 1, j);                    // 5
                }
            }

            /* If no two elements were swapped by inner loop, then break  */
            if (!swapped) {                                         // 6
                break;                                              // 6
            }
        }
    }

    /* Swap two array elements: elements[a] with elements[b] */
    public static void swap(int[] elements, int a, int b) {
        int tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
        swapped = true; // a swap has occurred
    }
}
