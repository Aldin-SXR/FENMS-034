package week3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] elements = {5, -1, 7, 19, 3, 12, 4};

        BubbleSort.sort(elements);

        /* Print the elements */
		for (int i: elements) {
			System.out.println(i);
		}
    }
}
