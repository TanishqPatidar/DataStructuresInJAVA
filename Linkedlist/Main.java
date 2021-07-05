public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.print();
        list.addLast(40);
        list.addLast(50);
        list.addLast(70);
        list.print();
        list.addAt(5,60);
        list.print();
        list.deleteAt(5);
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();

        DoublyLinkedList dList = new DoublyLinkedList();
        dList.insertFirst(25);
        dList.insertFirst(15);
        dList.insertFirst(5);
        dList.printList();
        dList.insertLast(35);
        dList.insertLast(45);
        dList.insertLast(55);
        dList.printList();
        dList.insertAt(3,75);
        dList.printList();
        dList.remove(3);
        dList.printList();
    }
        }
