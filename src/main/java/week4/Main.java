package week4;

public class Main {
    public static void main(String[] args) {
        selectionSort();
        insertionSort();
        shellSort();
    }

    public static void selectionSort() {
        System.out.println("Selection sort:");
        int[] elements = {5, -1, 7, 19, 3, 12, 4};

        SelectionSort.sort(elements);

        /* Print the elements */
        for (int i: elements) {
            System.out.println(i);
        }
    }

    public static void insertionSort() {
        System.out.println("Insertion sort:");
        int[] elements = {5, -1, 7, 19, 3, 12, 4};

        InsertionSort.sort(elements);

        /* Print the elements */
        for (int i: elements) {
            System.out.println(i);
        }
    }

    public static void shellSort() {
        System.out.println("Shell sort:");
        int[] elements = {5, -1, 7, 19, 3, 12, 4};

        ShellSort.sort(elements);

        /* Print the elements */
        for (int i: elements) {
            System.out.println(i);
        }
    }
}
