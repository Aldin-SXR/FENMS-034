package week2;

public class Main {
    public static void main(String[] args) {
        /* Stack demo */
        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(8);
        stack.push(5);

        System.out.println("Stack demo: ");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(10);
        System.out.println("stack size: " + stack.size());

        /* Queue demo */
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Queue demo: ");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(4);

        System.out.println("queue size: " + queue.size());
    }
}
