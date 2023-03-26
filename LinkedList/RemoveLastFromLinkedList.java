package LinkedList;

public class RemoveLastFromLinkedList {
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

    public int removeLast(){
        if(head == null){
            return -1;
        }

        if(head.next == null){
            int removed = head.data;
            head = tail = null;
            return removed;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int removed = temp.next.data;
        tail = temp;
        temp.next = null;
        return removed;
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
        RemoveLastFromLinkedList ll = new RemoveLastFromLinkedList();
        ll.addLast(0);
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);

        printLinkedList(head);
        System.out.println(ll.removeLast());
        printLinkedList(head);
        System.out.println(tail.data);
    }
}
