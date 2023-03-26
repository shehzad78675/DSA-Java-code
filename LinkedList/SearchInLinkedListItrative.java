package LinkedList;

public class SearchInLinkedListItrative {
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

    public int search(int item){
        if(head == null){
            return -1;
        }

        Node temp = head;
        int ind = 0;
        while(temp != null){
            if(temp.data == item){
                return ind;
            }
            ind++;
            temp=temp.next;
        }
        return -1;
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
        SearchInLinkedListItrative ll = new SearchInLinkedListItrative();
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);

        printLinkedList(head);
        System.out.println(ll.search(4));
    }
}
