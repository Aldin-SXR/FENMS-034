package week5;

import org.junit.jupiter.api.Test;
import week5.labTask.TimSort;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimSortTest {

    private static class Student implements Comparable<Student> {
        String name;
        double gpa;

        public Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        @Override
        public int compareTo(Student o) {
            return Double.compare(this.gpa, o.gpa);
        }
    }

    @Test
    public void testIntegerSorting() {
        Integer[] array = {5, -1, 7, 19, 3, 12, 4};

        TimSort.sort(array, 4);

        assertEquals(-1, array[0]);
        assertEquals(3, array[1]);
        assertEquals(4, array[2]);
        assertEquals(5, array[3]);
        assertEquals(7, array[4]);
        assertEquals(12, array[5]);
        assertEquals(19, array[6]);
    }

    @Test
    public void testDoubleSorting() {
        Double[] array = {3.4, -11.2, 43.6, 22.5, 7.12, 5.24, 66.2};

        TimSort.sort(array, 4);

        assertEquals(-11.2, array[0]);
        assertEquals(3.4, array[1]);
        assertEquals(5.24, array[2]);
        assertEquals(7.12, array[3]);
        assertEquals(22.5, array[4]);
        assertEquals(43.6, array[5]);
        assertEquals(66.2, array[6]);
    }

    @Test
    public void testCharacterSorting() {
        Character[] array = {'y', 'm', 'a', 'c', 's', 'h', 'b'};

        TimSort.sort(array, 4);

        assertEquals('a', array[0]);
        assertEquals('b', array[1]);
        assertEquals('c', array[2]);
        assertEquals('h', array[3]);
        assertEquals('m', array[4]);
        assertEquals('s', array[5]);
        assertEquals('y', array[6]);
    }

    @Test
    public void testStringSorting() {
        String[] array = {"qSiVYcEivp", "KHvpckFnVd", "RLbAwtkquH", "YmWxBwcHOZ", "NNAXXpPkpR", "hfRcldttwR", "lWtzsZCyPh"};

        TimSort.sort(array, 4);

        assertEquals("KHvpckFnVd", array[0]);
        assertEquals("NNAXXpPkpR", array[1]);
        assertEquals("RLbAwtkquH", array[2]);
        assertEquals("YmWxBwcHOZ", array[3]);
        assertEquals("hfRcldttwR", array[4]);
        assertEquals("lWtzsZCyPh", array[5]);
        assertEquals("qSiVYcEivp", array[6]);
    }

    @Test
    public void testCustomObjectSorting() {
        Student[] array = {
                new Student("Student A", 6.3),
                new Student("Student B", 9.93),
                new Student("Student C", 5.76),
                new Student("Student D", 8.21),
                new Student("Student E", 7.74),
                new Student("Student F", 10.0),
                new Student("Student G", 9.2)
        };

        TimSort.sort(array, 4);

        assertEquals(5.76, array[0].gpa);
        assertEquals(6.3, array[1].gpa);
        assertEquals(7.74, array[2].gpa);
        assertEquals(8.21, array[3].gpa);
        assertEquals(9.2, array[4].gpa);
        assertEquals(9.93, array[5].gpa);
        assertEquals(10.0, array[6].gpa);
    }

    @Test
    public void testCalculateRunLength() {
        int threshold = 8;
        assertEquals(5, TimSort.calculateRunLength(19, threshold));
        assertEquals(9, TimSort.calculateRunLength(17, threshold));
        assertEquals(6, TimSort.calculateRunLength(21, threshold));
        assertEquals(7, TimSort.calculateRunLength(7, threshold));
    }

    @Test
    public void testPartialInsertionSort() {
        Integer[] array = {4, -2, 7, 19, 3, 12, 9, 21, -5, 17, 8};

        TimSort.insertionSort(array, 0, 3);
        TimSort.insertionSort(array, 6, 8);
        TimSort.insertionSort(array, 9, 10);

        assertEquals(-2, array[0]);
        assertEquals(4, array[1]);
        assertEquals(7, array[2]);
        assertEquals(19, array[3]);
        assertEquals(3, array[4]);
        assertEquals(12, array[5]);
        assertEquals(-5, array[6]);
        assertEquals(9, array[7]);
        assertEquals(21, array[8]);
        assertEquals(8, array[9]);
        assertEquals(17, array[10]);
    }

    @Test
    public void testMerge() {
        Integer[] array = {-2, 4, 7, 19, 3, 9, 12, 21, -5, 8, 17};
        Integer[] aux = new Integer[array.length];

        TimSort.merge(array, aux, 0, 3, 7);

        assertEquals(-2, array[0]);
        assertEquals(3, array[1]);
        assertEquals(4, array[2]);
        assertEquals(7, array[3]);
        assertEquals(9, array[4]);
        assertEquals(12, array[5]);
        assertEquals(19, array[6]);
        assertEquals(21, array[7]);
    }

    @Test
    public void testLargeRandomSort() {
        int size = 10000000;
        Integer[] array = new Integer[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(size * 10);
        }

        Integer[] sorted = array.clone();
        Arrays.sort(sorted);

        assertEquals(77, TimSort.calculateRunLength(size, 128));
        TimSort.sort(array, 64);
        assertArrayEquals(sorted, array);
    }
}
