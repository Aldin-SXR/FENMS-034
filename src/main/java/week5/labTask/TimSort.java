package week5.labTask;

public class TimSort {

    public static <Data extends Comparable<Data>> void sort(Data[] elements, int threshold) {
        // HINT: It is not possible to directly create a new generic array in Java,
        // so you can use this workaround - create a Comparable array and cast it
        // Data[] aux = (Data[]) new Comparable[elements.length];

        // your code here
    }

    public static <Data extends Comparable<Data>> void insertionSort(Data[] elements, int low, int high) {
        // your code here
    }

    public static <Data extends Comparable<Data>> void merge(Data[] elements, Data[] aux, int low, int mid, int high) {
        // your code here
    }

    public static int calculateRunLength(int initialLength, int threshold) {
        // your code here (next line is a placeholder)
        return 0;
    }
}
