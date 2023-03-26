package Stack;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            stack.push(ch);
        }

        StringBuilder newStr = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            newStr.append(stack.pop());
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverseString(str));
    }
}
