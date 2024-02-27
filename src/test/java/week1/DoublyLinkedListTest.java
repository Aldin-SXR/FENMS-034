package week1;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DoublyLinkedListTest {

    @Test
    void testAddToFront() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.addToFront(1);
        dll.addToFront(3);
        dll.addToFront(10);

        assertEquals(10, dll.get(0));
        assertEquals(3, dll.get(1));
        assertEquals(1, dll.get(2));
    }

    @Test
    void testAddToRear() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.addToRear(1);
        dll.addToRear(3);
        dll.addToRear(10);

        assertEquals(1, dll.get(0));
        assertEquals(3, dll.get(1));
        assertEquals(10, dll.get(2));
    }

    @Test
    void testGet() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.addToRear(1);
        dll.addToRear(3);
        dll.addToRear(10);

        assertEquals(1, dll.get(0));
        assertEquals(3, dll.get(1));
        assertEquals(10, dll.get(2));
    }

    @Test
    void testRemoveFromFront() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.addToRear(1);
        dll.addToRear(3);

        dll.removeFromFront();
        assertEquals(3, dll.get(0));
    }

    @Test
    void testRemoveFromRear() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.addToRear(1);
        dll.addToRear(3);

        dll.removeFromRear();
        assertEquals(1, dll.get(0));
    }

    @Test
    void testCount() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.addToRear(1);
        dll.addToRear(3);

        assertEquals(2, dll.count());

        dll.addToFront(4);
        dll.addToRear(4);

        assertEquals(4, dll.count());

        dll.removeFromRear();

        assertEquals(3, dll.count());
    }

    @Test
    void testRemoveFromEmpty() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
            dll.removeFromFront();
        });
    }

    @Test
    void testGetFromEmpty() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
            dll.get(0);
        });
    }

    @Test
    void testGetNegativeIndexedNode() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
            dll.addToRear(4);
            dll.addToRear(5);
            dll.get(-1);
        });
    }

    @Test
    void testGetHeadAndTail() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.addToRear(4);
        dll.addToRear(5);
        dll.addToRear(6);
        dll.addToRear(7);

        DoubleNode<Integer> head = dll.getHead();
        DoubleNode<Integer> tail = dll.getTail();

        assertEquals(4, head.data);
        assertEquals(7, tail.data);
    }

    @Test
    void testNextAndPrevNode() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.addToRear(4);
        dll.addToRear(8);
        dll.addToRear(6);

        DoubleNode<Integer> node = dll.getHead().next; // should be node "8"

        assertEquals(4, node.prev.data);
        assertEquals(6, node.next.data);
    }

    @Test
    void testAllOperations() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.addToRear(4);
        dll.addToRear(8);
        dll.addToRear(1);
        dll.addToFront(7);
        dll.addToFront(11);
        dll.addToFront(6);
        dll.removeFromRear();
        dll.removeFromFront();
        dll.add(2, 9);
        dll.remove(3);


        DoubleNode<Integer> node = dll.getHead();
        assertEquals(11, node.data);
        assertNull(node.prev);
        assertEquals(7, node.next.data);

        node = node.next;
        assertEquals(7, node.data);
        assertEquals(11, node.prev.data);
        assertEquals(9, node.next.data);

        node = node.next;
        assertEquals(9, node.data);
        assertEquals(7, node.prev.data);
        assertEquals(8, node.next.data);

        node = node.next;
        assertEquals(8, node.data);
        assertEquals(9, node.prev.data);
        assertNull(node.next);
    }

}