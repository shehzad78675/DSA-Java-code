package LinkedList;

public class AddInLinkedList {
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

    public void add(int data, int index){
        Node newNode = new Node(data);
        if(index == 0 && head == null){
            head = newNode;
            tail = head;
            return;
        }

        if(index == 0 && head != null){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int count = 0;
        while(count+1 != index && temp != null){
            temp = temp.next;
            count = count+1;
        }

        if(temp == null){
            System.out.println("Index out of bound");
            return;
        }

        if(temp.next == null){
            temp.next = newNode;
            tail = newNode;
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddInLinkedList ll = new AddInLinkedList();
        ll.add(0,0);
        ll.add(1,1);
        ll.add(2,2);
        ll.add(3,2);

        printLinkedList(head);
    }
}
