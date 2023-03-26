package Stack;

import java.util.Stack;

public class NextGreaterRight {
    public static void nextGrater(int arr[], int nextGrater[]){
        Stack<Integer> stack = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextGrater[i] = -1;
            }else{
                nextGrater[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = {6,8,0,1,3};
        int span[] = new int[stocks.length];

        nextGrater(stocks, span);

        for(int i=0; i<span.length; i++){
            System.out.print(span[i] + " ");
        }
    }
}
