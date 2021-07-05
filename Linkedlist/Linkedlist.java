public class Linkedlist{

    Node head;

    public class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
    public void addFirst(int data){

        Node node = new Node(data);
        node.next = head;
            head = node;
        }

    public void addLast(int data){
       Node node  = new Node(data);

       if(head==null){
           head = node;
       }
       else{
           Node temp = head;
           while (temp.next!=null) {
               temp = temp.next;
           }
           temp.next = node;
       }
    }

    public void addAt(int index,int data) {
        Node node = new Node(data);
        if (index == 0) {
            addFirst(data);
        } else {
            Node temp = head;

            for (int i=0;i<=index-1 ;i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next =  node;
    }
    }
    public void deleteFirst(){
        head = head.next;
    }
    public void deleteLast(){

        Node temp = head;

        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;

    }
    public void deleteAt(int index){
        if(index==0){
            deleteFirst();
        }
        else{
            Node temp = head;
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.next = null;
        }
    }
    public void print(){
        Node n = head;
        while(n.next!=null)
        {
            System.out.print(" "+n.value);
            n = n.next;
        }
        System.out.println(" "+n.value);

    }
        }
