public class DoublyLinkedList {
    Node head;

    public class Node {
        Node prev=null;
        int value;
        Node next=null;

        Node(int value) {
            this.value = value;
        }
    }
    public void insertFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }

        else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
    public void insertLast(int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
    }
    public void insertAt(int index,int data){
        Node node = new Node(data);

        if(index==0) {
            insertFirst(data);
        }
        else{
            Node temp = head;

            for(int i=0;i<index-1;i++)
            {
                temp = temp.next;
            }
            node.next = temp.next;
            node.prev = temp;
            node.next.prev = node;
            temp.next = node;

        }
    }
    public void removeFirst(){
        Node temp = head;
        temp.next.prev = null;
    }
    public void removeLast(){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next.prev = null;
        temp.next = null;
    }

    public void remove(int index){
        if(index==0){
            removeFirst();
        }
        else{
            Node temp = head;

            for(int i=0;i<=index-1;i++)
            {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev=temp.prev;
        }
    }
    public void printList(){
        Node temp = head;
        while(temp.next!=null)
        {
            System.out.print(" "+temp.value);
            temp = temp.next;
        }
        System.out.println(" "+temp.value);

    }
}