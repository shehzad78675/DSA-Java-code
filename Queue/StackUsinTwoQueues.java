package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsinTwoQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }

    public int size(){
        if(!q1.isEmpty()){
            return q1.size();
        }else{
            return q2.size();
        }
    }

    public void push(int data){
        if(!q1.isEmpty()){
            q1.add(data);
        }else{
            q2.add(data);
        }
    }

    public int pop(){
        int top = -1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
            }
        }else{
            while(!q2.isEmpty()){
                top = q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }

    public int peek(){
        int top = -1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                q2.add(top);
            }
        }else{
            while(!q2.isEmpty()){
                top = q2.remove();
                q1.add(top);
            }
        }
        return top;
    }

    public static void main(String[] args) {
        StackUsinTwoQueues stack = new StackUsinTwoQueues();

        System.out.println(stack.isEmpty());
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
 }
