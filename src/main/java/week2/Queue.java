package week2;

import java.util.NoSuchElementException;

public class Queue<Data> {
    private Node<Data> head = null;
    private Node<Data> tail = null;
    private int size = 0;

    /* Return the current size of the queue */
    public int size() {
        return size;
    }

    /* Check if the queue is empty */
    public boolean isEmpty() {
        return size == 0;
    }

    /* Add new item to the back of the queue */
    public void enqueue(Data item) {
        Node<Data> newNode = new Node<>();	    // 1
        newNode.data = item;					// 1
        if (isEmpty()) {						// 2
            head = tail = newNode;				// 2
        } else {
            tail.next = newNode;				// 3
            tail = newNode;						// 4
        }
        size++;									// 5
    }

    /* Removes an item from the front of the queue, and returns its data */
    public Data dequeue() {
        if (isEmpty()) {												// 1
            throw new NoSuchElementException("Queue is empty!");		// 1
        }

        Data data = head.data;											// 2
        head = head.next;												// 3
        size--;															// 4

        if (isEmpty()) {											    // 5
            tail = null;												// 5
        }

        return data;													// 6
    }

    /* Reads an item at the front of the queue, without removing it */
    public Data peek() {
        if (isEmpty()) {												// 1
            throw new NoSuchElementException("Queue is empty!");		// 1
        }

        return head.data;											    // 2
    }
}
