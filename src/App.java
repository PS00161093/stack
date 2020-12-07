package src;

class App {

    public static void main(String[] args) {

        MyStack myStack = new MyStack(1);

        myStack.push(2);
        myStack.push(3);
        myStack.peek();

        myStack.push(4);
        myStack.printValues();

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();

        myStack.printValues();
        myStack.peek();

        MyQueue myQueue = new MyQueue();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);

        myQueue.peek();
        myQueue.dequeue();

        myQueue.peek();
        myQueue.dequeue();

        myQueue.peek();
        myQueue.dequeue();

        myQueue.peek();
        myQueue.dequeue();

        myQueue.peek();

    }
}