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

    public void pop(){

        this.currentNode = this.previousNode;
        this.previousNode = currentNode.nextNode;
        length--;

    }
    public int peek(){

        return this.currentNode != null ? this.currentNode.value : null;
    }

    public void printValues() {

        Node currentNode = this.currentNode;
        while (currentNode.nextNode != null){
            System.out.print(currentNode.value + ", ");
            currentNode = currentNode.nextNode;
        }
        System.out.println(currentNode.value);

    }

    public int getLength(){

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