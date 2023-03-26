package LinkedList;

public class ReverseLinkedList {
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

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void reverse(){
        if(head == null){
            return;
        }

        Node curr = tail = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next  = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // System.out.println(prev.next.data);
        head = prev;
    }

    public static void printLinkedList(Node head){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);

        printLinkedList(head);
        ll.reverse();
        printLinkedList(head);
    }
}
