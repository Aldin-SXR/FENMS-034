package week4;

public class InsertionSort extends AbstractSort {

    /* Insertion sort algorithm */
    public static void sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {				// 1
            for (int j = i; j > 0; j--) {						// 2
                if (less(elements[j], elements[j - 1])) {		// 3
                    swap(elements, j, j - 1);				// 3
                } else {
                    break;										// 4
                }
            }
        }
    }
}
