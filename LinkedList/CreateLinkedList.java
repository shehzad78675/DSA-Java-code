package LinkedList;

public class CreateLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node head;

    public static void main(String[] args) {
        CreateLinkedList ll = new CreateLinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);

        printLinkedList(ll.head);
    }
}
