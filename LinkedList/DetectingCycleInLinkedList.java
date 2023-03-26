package LinkedList;

public class DetectingCycleInLinkedList {
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
            tail.next = head;
            return;
        }
        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
    }

    public boolean detectingCycle(Node head){
        if(head == null){
            return false;
        }

        Node fast = head.next;
        Node slow = head;

        while(fast != null && fast.next != null){
            if(slow.data == fast.data){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void printLinkedList(Node head){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head.next;
        System.out.print(head.data + " ");
        while(temp != head && temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        DetectingCycleInLinkedList ll = new DetectingCycleInLinkedList();
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);

        printLinkedList(head);
        System.out.println(ll.detectingCycle(head));
    }
}
