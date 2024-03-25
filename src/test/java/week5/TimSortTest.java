package week4;

import org.junit.jupiter.api.*;
import week4.labTask.BinaryInsertionSort;
import week4.labTask.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryInsertionSortTest {

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
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addToRear(5);
        ll.addToRear(-1);
        ll.addToRear(7);
        ll.addToRear(19);
        ll.addToRear(3);
        ll.addToRear(12);
        ll.addToRear(4);

        BinaryInsertionSort.sort(ll);

        assertEquals(-1, ll.get(0));
        assertEquals(3, ll.get(1));
        assertEquals(4, ll.get(2));
        assertEquals(5, ll.get(3));
        assertEquals(7, ll.get(4));
        assertEquals(12, ll.get(5));
        assertEquals(19, ll.get(6));
    }

    @Test
    public void testDoubleSorting() {
        LinkedList<Double> ll = new LinkedList<>();

        ll.addToRear(3.4);
        ll.addToRear(-11.2);
        ll.addToRear(43.6);
        ll.addToRear(22.5);
        ll.addToRear(7.12);
        ll.addToRear(5.24);
        ll.addToRear(66.2);

        BinaryInsertionSort.sort(ll);

        assertEquals(-11.2, ll.get(0));
        assertEquals(3.4, ll.get(1));
        assertEquals(5.24, ll.get(2));
        assertEquals(7.12, ll.get(3));
        assertEquals(22.5, ll.get(4));
        assertEquals(43.6, ll.get(5));
        assertEquals(66.2, ll.get(6));
    }

    @Test
    public void testCharacterSorting() {
        LinkedList<Character> ll = new LinkedList<>();

        ll.addToRear('y');
        ll.addToRear('m');
        ll.addToRear('a');
        ll.addToRear('c');
        ll.addToRear('s');
        ll.addToRear('h');
        ll.addToRear('b');

        BinaryInsertionSort.sort(ll);

        assertEquals('a', ll.get(0));
        assertEquals('b', ll.get(1));
        assertEquals('c', ll.get(2));
        assertEquals('h', ll.get(3));
        assertEquals('m', ll.get(4));
        assertEquals('s', ll.get(5));
        assertEquals('y', ll.get(6));
    }

    @Test
    public void testStringSorting() {
        LinkedList<String> ll = new LinkedList<>();

        ll.addToRear("qSiVYcEivp");
        ll.addToRear("KHvpckFnVd");
        ll.addToRear("RLbAwtkquH");
        ll.addToRear("YmWxBwcHOZ");
        ll.addToRear("NNAXXpPkpR");
        ll.addToRear("hfRcldttwR");
        ll.addToRear("lWtzsZCyPh");

        BinaryInsertionSort.sort(ll);

        assertEquals("KHvpckFnVd", ll.get(0));
        assertEquals("NNAXXpPkpR", ll.get(1));
        assertEquals("RLbAwtkquH", ll.get(2));
        assertEquals("YmWxBwcHOZ", ll.get(3));
        assertEquals("hfRcldttwR", ll.get(4));
        assertEquals("lWtzsZCyPh", ll.get(5));
        assertEquals("qSiVYcEivp", ll.get(6));
    }

    @Test
    public void testCustomObjectSorting() {
        LinkedList<Student> ll = new LinkedList<>();

        ll.addToRear(new Student("Student A", 6.3));
        ll.addToRear(new Student("Student B", 9.93));
        ll.addToRear(new Student("Student C", 5.76));
        ll.addToRear(new Student("Student D", 8.21));
        ll.addToRear(new Student("Student E", 7.74));
        ll.addToRear(new Student("Student F", 10.0));
        ll.addToRear(new Student("Student G", 9.2));

        BinaryInsertionSort.sort(ll);

        assertEquals(5.76, ll.get(0).gpa);
        assertEquals(6.3, ll.get(1).gpa);
        assertEquals(7.74, ll.get(2).gpa);
        assertEquals(8.21, ll.get(3).gpa);
        assertEquals(9.2, ll.get(4).gpa);
        assertEquals(9.93, ll.get(5).gpa);
        assertEquals(10.0, ll.get(6).gpa);
    }

    @Test
    public void testInsertionPoint() {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addToRear(-2);
        ll.addToRear(3);
        ll.addToRear(7);
        ll.addToRear(12);
        ll.addToRear(6);
        ll.addToRear(19);
        ll.addToRear(4);

        assertEquals(0, BinaryInsertionSort.findInsertionPoint(ll, 3, -5));
        assertEquals(1, BinaryInsertionSort.findInsertionPoint(ll, 3, 2));
        assertEquals(2, BinaryInsertionSort.findInsertionPoint(ll, 3, 5));
        assertEquals(3, BinaryInsertionSort.findInsertionPoint(ll, 3, 9));
        assertEquals(4, BinaryInsertionSort.findInsertionPoint(ll, 3, 15));
    }
}
