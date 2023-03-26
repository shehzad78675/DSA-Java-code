package LinkedList;

public class RemoveCycle{
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

    public void removeCycle(Node head){
        if(head == null){
            return;
        }

        Node fast = head.next;
        Node slow = head;

        while(fast != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }

        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = null;
    }

    public static void printLinkedList(Node head){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        // System.out.print(head.data + " ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveCycle ll = new RemoveCycle();
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);

        // printLinkedList(head);
        ll.removeCycle(head);
        printLinkedList(head);
    }
}
