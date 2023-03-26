package Stack;

import java.util.Stack;

public class PushAtBottom {
    public static void pushAtBottom(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }

        int val = stack.pop();
        pushAtBottom(stack, data);
        stack.push(val);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushAtBottom(stack, 4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
