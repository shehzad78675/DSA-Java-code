package LinkedList;

public class RemoveNthNodeFromEnd {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int remove(int index) {
        if (head == null) {
            return -1;
        }
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int ind = count - index - 1;

        if (ind == 0) {
            int removed = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return removed;
        }
        count = 0;
        temp = head;
        while (temp != null && count != ind - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Index out of bound");
            return -1;
        }

        if (temp.next.next == null) {
            int removed = temp.next.data;
            temp.next = null;
            tail = temp.next;
            return removed;
        }

        int removed = temp.next.data;
        temp.next = temp.next.next;
        return removed;
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEnd ll = new RemoveNthNodeFromEnd();
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);

        printLinkedList(head);
        System.out.println(ll.remove(0));
        printLinkedList(head);
    }
}
