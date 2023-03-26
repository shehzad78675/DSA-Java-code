package LinkedList;

public class ZigZagLinkedList {
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

    public Node findMid(Node head){
        if(head == null){
            return null;
        }

        Node fast = head.next;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void zigZagList(){
        if(head == null && head.next == null){
            return;
        }
        // find mid
        Node midNode = findMid(head);

        // Reverse from middle
        Node prev = null;
        Node curr = midNode;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        Node nextL, nextR;

        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            
            left = nextL;
            right = nextR;
        }
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
        ZigZagLinkedList ll = new ZigZagLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        printLinkedList(head);
        ll.zigZagList();
        printLinkedList(head);
    }    
}
