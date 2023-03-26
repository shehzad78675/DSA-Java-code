package Stack;

public class StackUsingLinkedList {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node head;

    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        System.out.println(stack.isEmpty());

        stack.push(0);
        stack.push(1);
        stack.push(2);

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
