class App {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(10);

        myLinkedList.append(12);
        myLinkedList.append(14);
        System.out.println("Size = " + myLinkedList.getSize());

        myLinkedList.prepend(8);
        myLinkedList.prepend(6);
        System.out.println("Size = " + myLinkedList.getSize());

        System.out.print("Before pushItem(): ");
        myLinkedList.getAllItems();
        System.out.println();

        myLinkedList.pushItem(1, 15);
        System.out.print("After pushItem(): ");
        myLinkedList.getAllItems();
        System.out.println();

        myLinkedList.pushItem(0, 4);
        System.out.print("After pushItem() at beginning: ");
        myLinkedList.getAllItems();
        System.out.println();
        System.out.println("Size = " + myLinkedList.getSize());

        System.out.println("Item at 0th index: " + myLinkedList.getItemAtIndex(0));
        System.out.println("Iteam at 4th index: " + myLinkedList.getItemAtIndex(4));

        myLinkedList.remove(0);
        System.out.print("After removing element at index 0: ");
        myLinkedList.getAllItems();

        System.out.println();
        myLinkedList.remove(2);
        System.out.print("After removing element at index 2: ");
        myLinkedList.getAllItems();

        System.out.println();
        System.out.print("After removing element at index 5: ");
        myLinkedList.remove(5);
        myLinkedList.getAllItems();

        System.out.println();
        System.out.print("After reversing: ");
        MyLinkedList reverseList = myLinkedList.reverse();
        reverseList.getAllItems();
    }
}