package Stack;

import java.util.ArrayList;

public class StackUsingArrayList {
    static ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public void push(int data){
        list.add(data);
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int val = peek();
        list.remove(list.size()-1);
        return val;
    }

    public static void main(String[] args) {
        StackUsingArrayList stack = new StackUsingArrayList();
        stack.isEmpty();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
    }
}
