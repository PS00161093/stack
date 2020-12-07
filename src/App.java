package src;

class App {

    public static void main(String[] args) {

        MyStack myStack = new MyStack(1);
        System.out.println(myStack.peek());

        myStack.push(2);
        System.out.println(myStack.peek());

        myStack.push(3);
        System.out.println(myStack.peek());

        myStack.push(4);
        System.out.println(myStack.peek());

        myStack.printValues();

        myStack.pop();
        myStack.printValues();
        System.out.println(myStack.peek());

        myStack.pop();
        myStack.printValues();
        System.out.println(myStack.peek());

    }
}