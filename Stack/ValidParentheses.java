package Stack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean validParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((top == '[' && ch == ']') || (top == '{' && ch == '}') || (top == '(' && ch == ')')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "({()}))";
        System.out.println(validParentheses(str));
    }
}
