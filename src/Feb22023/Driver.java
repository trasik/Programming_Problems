package Feb22023;

import java.util.Stack;

public class Driver {

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";

        System.out.println("Is " + s1 + " Valid Parenthesis?: " + isValid(s1));
        System.out.println("Is " + s2 + " Valid Parenthesis?: " + isValid(s2));
        System.out.println("Is " + s3 + " Valid Parenthesis?: " + isValid(s3));

    }

    public static boolean isValid(String s) {
        if(s == null || s.length() == 0) return false;

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(') stack.push(')');
            else if(c == '{') stack.push('}');
            else if(c == '[') stack.push(']');
            else if(stack.isEmpty() || c != stack.pop()) return false;
        }

        return stack.isEmpty();
    }
}
