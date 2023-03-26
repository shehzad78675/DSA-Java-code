package LinkedList;

public class AddFirstInLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = head;
            return;
        }

        Node temp = head;
        head = newNode;
        head.next = temp;
    }

    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddFirstInLinkedList ll = new AddFirstInLinkedList();
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(2);

        printLinkedList(head);
    }

}
