package src;

public class MyQueue {

    private Node first;

    private Node last;

    private int length;

    public void enqueue(int newValue) {

        Node newNode = new Node(newValue);
        if (this.length == 0) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.next = newNode;
            this.last = newNode;
        }
        this.length++;
    }

    public void peek() {
        if (this.length == 0) {
            System.out.println("Empty Queue");
        } else {
            System.out.println(this.first.value);
        }
    }

    public void dequeue() {

        if (this.length == 0) {
            System.out.println("Empty Queue");
        }
        if (length == 1) {
            this.last = null;
        }
        this.first = this.first.next;
        this.length--;
    }


    static class Node {

        int value;

        Node next;

        public Node(int newValue) {

            this.value = newValue;
            this.next = null;
        }
    }
}

