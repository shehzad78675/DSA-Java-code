package LinkedList;

public class SearchInLinkedListRecursive {
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

    public int search(Node head, int item){
        if(head == null){
            return -1;
        }

        if(head.data == item){
            return 0;
        }

        int ind = search(head.next, item);
        if(ind == -1){
            return -1;
        }
        return ind+1;
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
        SearchInLinkedListRecursive ll = new SearchInLinkedListRecursive();
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);

        printLinkedList(head);
        System.out.println(ll.search(head, 2));
    }
}
