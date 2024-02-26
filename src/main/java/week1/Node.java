package week1;

public class Node <Data>{
    Data data;
    Node<Data> next;

    public Node() { }

    public Node(Data data) {
        this.data = data;
    }
}