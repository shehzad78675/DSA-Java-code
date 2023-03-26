package Queue;

import java.util.Stack;

public class QueueUsingTwoStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public boolean isEmpty(){
        return stack1.isEmpty();
    }

    public void add(int data){
        if(isEmpty()){
            stack1.push(data);
            return;
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        stack1.push(data);

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int data = stack1.pop();
        return data;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }

        return stack1.peek();
    }

    public int size(){
        return stack1.size();
    }
    public static void main(String[] args) {
        QueueUsingTwoStacks q = new QueueUsingTwoStacks();

        System.out.println(q.size());
        System.out.println(q.isEmpty());

        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.size());
        System.out.println(q.isEmpty());

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

        System.out.println(q.remove());
        System.out.println(q.remove());
        
        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
