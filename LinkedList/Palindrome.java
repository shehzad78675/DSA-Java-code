package LinkedList;

public class Palindrome {
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

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(){
        if(head == null && head.next == null){
            return true;
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
        while(left != null && right != null){
            if(left.data != right.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
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
        Palindrome ll = new Palindrome();
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(5);
        ll.addLast(1);
        ll.addLast(1);

        printLinkedList(head);
        System.out.println(ll.isPalindrome());
    }
}
