package week2;

import java.util.NoSuchElementException;

public class Stack<Data> {
    private Node<Data> top = null;
    private int size = 0;


    /* Push an item onto the stack */
    public void push(Data item) {
        Node<Data> newNode = new Node<>();      // 1
        newNode.data = item; 				    // 1
        newNode.next = top; 				    // 2
        top = newNode; 						    // 3
        size++;								    // 4
    }

    /* Check if the stack is empty */
    public boolean isEmpty() {
        return size == 0;
    }

    /* Remove the top item from the stack, and return its data */
    public Data pop() {
        if (isEmpty()) {													// 1
            throw new NoSuchElementException("The stack is empty.");		// 1
        }																	// 1
        Data item = top.data; 												// 2
        top = top.next; 													// 3
        size--;															    // 4
        return item; 														// 5
    }

    /* Return the current size of the stack */
    public int size() {
        return size;
    }

    /* Reads an item at the top of the stack, without removing it */
    public Data peek() {
        if (isEmpty()) {												// 1
            throw new NoSuchElementException("Stack is empty!");		// 1
        }

        return top.data;											    // 2
    }
}
