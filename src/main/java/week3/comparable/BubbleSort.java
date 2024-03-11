package week3.comparable;

public class BubbleSort {
    /* Swap marker; whether there was a swap in the inner loop */
    static boolean swapped;

    /* Perform the bubble sort algorithm */
    public static <Data extends Comparable<Data>> void sort(Data[] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 1; j < elements.length - i; j++) {
                if (elements[j - 1].compareTo(elements[j]) > 0) {
                    swap(elements, j - 1, j);
                }
            }

            /* If no two elements were swapped by inner loop, then break  */
            if (!swapped) {
                break;
            }
        }
    }

    /* Swap two array elements: elements[a] with elements[b] */
    public static <Data extends Comparable<Data>> void swap(Data[] elements, int a, int b) {
        Data tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
        swapped = true; // a swap has occurred
    }
}
