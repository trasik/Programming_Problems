package Jan232023;

import java.util.Stack;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Backspace String Compare
        String s1 = "ab#c";
        String t1 = "ad#c";
        String s2 = "ab##";
        String t2 = "c#d#";
        String s3 = "a#c";
        String t3 = "b";

        System.out.println(backspaceCompare(s1, t1));
        System.out.println(backspaceCompare(s2, t2));
        System.out.println(backspaceCompare(s3, t3));
    }

    public static boolean backspaceCompare(String s, String t) {
        return compareHelper(s).equals(compareHelper(t));
    }

    private static Stack<Character> compareHelper(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c != '#') stack.push(c);
            else if(!stack.isEmpty()) stack.pop();
        }

        return stack;
    }
}
