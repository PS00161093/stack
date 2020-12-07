package src;

public class MyStack {

    Node currentNode;

    Node previousNode;

    int length;

    public MyStack(int value) {

        this.currentNode = new Node(value);
        this.previousNode = this.currentNode;
        length++;

    }

    public void push(int newValue) {

        Node newNode = new Node(newValue);
        this.previousNode = this.currentNode;
        this.currentNode = newNode;
        this.currentNode.nextNode = this.previousNode;
        length++;

    }

    public void pop() {

        if (length == 1) {
            this.previousNode = null;
            this.currentNode = null;
        } else {
            this.currentNode = this.previousNode;
            this.previousNode = currentNode.nextNode;
        }
        length--;

    }

    public void peek() {

        if(this.currentNode == null){
            System.out.println("No item in Stack");
        }else {
            System.out.println(this.currentNode.value);
        }

    }

    public void printValues() {

        if (length == 0) {
            System.out.println("Empty Stack");
        } else {
            Node currentNode = this.currentNode;
            while (currentNode.nextNode != null) {
                System.out.print(currentNode.value + ", ");
                currentNode = currentNode.nextNode;
            }
            System.out.println(currentNode.value);
        }

    }

    public int getLength() {

        return this.length;
    }


    static class Node {

        Node(int value) {

            this.value = value;
            this.nextNode = null;
        }

        int value;

        Node nextNode;
    }

}