package week4.labTask;

import week1.Node;

import java.util.Iterator;

public class LinkedList<Data> {

    private static class Node<Data> {
        Data data;
        Node<Data> next;

    }
    private Node<Data> head;
    private int size = 0;

    /* Add a new item to the beginning of the list */
    public void addToFront(Data data) {
        Node<Data> newNode = new Node<>();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        size++;
    }

    /* Remove an item from the beginning of the list */
    public void removeFromFront() {
        if (head == null) {
            throw new IndexOutOfBoundsException("The linked list is empty.");
        }
        head = head.next;
        size--;
    }

    /* Add a new item to the end of the list */
    public void addToRear(Data data) {
        Node<Data> newNode = new Node<>();
        newNode.data = data;

        if (head == null) {
            head = newNode;
        } else {
            Node<Data> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    /* Remove an item from the end of the list */
    public void removeFromRear() {
        if (head == null) {
            throw new IndexOutOfBoundsException("The linked list is empty.");
        } else if (size == 1) {
            head = null;
        } else {
            Node<Data> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    /* Get a linked list node by index (0-indexed) */
    public Data get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid linked list node.");
        }

        Node<Data> current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }

        return current.data;
    }

    /* Add an element to a linked list by index (0-index) */
    public void add(int index, Data data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid linked list node.");
        }

        if (index == 0) {
            addToFront(data);
        } else if (index == size) {
            addToRear(data);
        } else {
            Node<Data> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node<Data> newNode = new Node<>();
            newNode.data = data;

            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    /* Delete an element from a linked list by index (0-index) */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid linked list node.");
        }

        if (index == 0) {
            removeFromFront();
        } else if (index == size - 1) {
            removeFromRear();
        } else {
            Node<Data> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }

    /* Return the size of the linked list */
    public int count() {
        return size;
    }
}