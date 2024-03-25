package week5;

import week5.comparator.ByName;
import week5.comparator.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        recursiveMergeSort();
        bottomUpMergeSort();
        testComparator();
    }

    public static void recursiveMergeSort() {
        System.out.println("Merge sort (recursive):");
        int[] elements = {5, -1, 7, 19, 3, 12, 4};

        MergeSort.sort(elements);

        /* Print the elements */
        for (int i: elements) {
            System.out.println(i);
        }
    }

    public static void bottomUpMergeSort() {
        System.out.println("Merge sort (bottom-up):");
        int[] elements = {5, -1, 7, 19, 3, 12, 4};

        BottomUpMergeSort.sort(elements);

        /* Print the elements */
        for (int i: elements) {
            System.out.println(i);
        }
    }

    public static void testComparator() {
        System.out.println("Test comparator:");
        Student[] students = {
                new Student("Joshua Valenzia", "IT", 5.9),
                new Student("Emily Davis", "EEE", 8.9),
                new Student("Marco May", "IT", 9.2),
                new Student("Megan Jones", "ARC", 8.7),
                new Student("Donald Lane", "IT", 9.1),
                new Student("Jessica Wilson", "IT", 7.8),
                new Student("Luke Ortiz", "EEE", 5.6),
                new Student("Sarah Johnson", "IT", 10),
                new Student("Yasin Nielsen", "ARC", 8.3),
                new Student("Rebecca Miller", "EEE", 6.9)
        };

        /* Sort the students according to GPA */
        Arrays.sort(students, new ByName());

        /* Print out the sorted students */
        for (Student s: students) {
            System.out.println(s.fullName + "\t|\t" + s.department + "\t|\t" + s.gpa);
        }
    }
}
