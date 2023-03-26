package Stack;

import java.util.Stack;

public class MaxRectangularAreaInHistogram {
    public static int maxAreaInHistogram(int heights[]){
        int nsl[] = new int[heights.length];
        int nsr[] = new int[heights.length];

        int maxArea = 0;

        Stack<Integer> stack = new Stack<>();
        for(int i=heights.length-1; i>=0; i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nsr[i] = heights.length;
            }else{
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }

        stack = new Stack<>();
        for(int i=0; i<heights.length; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }

        for(int i=0; i<heights.length; i++){
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;

            int currArea = height*width;
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        System.out.println(maxAreaInHistogram(heights));
    }
}
