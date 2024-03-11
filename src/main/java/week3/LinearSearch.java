package week3;

public class LinearSearch {
    /* Linear (sequential) search algorithm for integer arrays */
    public static int search (int[] elements, int key) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
