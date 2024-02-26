package week1;

public class DoubleNode<Data> {
    Data data;
    DoubleNode<Data> next;
    DoubleNode<Data> prev;

    public DoubleNode() { }

    public DoubleNode(Data data) {
        this.data = data;
    }
}
