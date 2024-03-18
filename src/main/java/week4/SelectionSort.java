package week4;

public class SelectionSort extends AbstractSort {

    /* Selection sort algorithm */
    public static void sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {             // 1
            int min = i;                                        // 2
            for (int j = i + 1; j < elements.length; j++) {     // 3
                if (less(elements[j], elements[min])) {         // 4
                    min = j;                                    // 4
                }
            }
            swap(elements, i, min);                             // 5
        }
    }
}
