package Queue;

public class QueueUsingLinkedList {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public boolean isEmpty(){
        return head == null && tail == null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int remove(){
        if(head == null){
            return -1;
        }
        int val = head.data;
        head = head.next;
        return val;
    }
    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();

        System.out.println(q.isEmpty());
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        // System.out.println(q.size());
        System.out.println(q.isEmpty());
        // System.out.println(q.isFull());

        q.add(5);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

        System.out.println(q.remove());
        System.out.println(q.remove());
        
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
