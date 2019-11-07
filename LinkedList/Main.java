/**
* Program: LinkedList
* Developer: Justin Shull
* Date: 10/3/19
* Purpose: Write a basic linked list from scratch
*/
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.setFront(new LLNode(1));
        list.setCurrent(new LLNode(2));
        list.setBack(new LLNode(3));
        printList(list);
        list.setFront(new LLNode(50)); // then test some of the methods to make sure they work
        list.setCurrent(new LLNode(100));
        list.setBack(new LLNode(150));
        printList(list);
    }

    public static void printList(LinkedList list) {
        System.out.print("Front: " + list.getFront() + " ");
        System.out.print("Current: " + list.getCurrent() + " ");
        System.out.print("Back: " + list.getBack() + " \n");
    }
}
