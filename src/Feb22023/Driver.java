package Feb22023;

import java.util.Stack;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Valid Parenthesis
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";

        System.out.println("Is " + s1 + " Valid Parenthesis?: " + isValid(s1));
        System.out.println("Is " + s2 + " Valid Parenthesis?: " + isValid(s2));
        System.out.println("Is " + s3 + " Valid Parenthesis?: " + isValid(s3));

        //Problem 2: Merge Two Sorted Lists
        ListNode list1 = new ListNode(1);
        list1.setNext(new ListNode(2));
        list1.getNext().setNext(new ListNode(4));

        ListNode list2 = new ListNode(1);
        list2.setNext(new ListNode(3));
        list2.getNext().setNext(new ListNode(4));

        printList(mergeTwoLists(list1, list2));
    }

    //Problem 1: Valid Parenthesis
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

    //Problem 2: Merge Two Linked Lists
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.getVal() < l2.getVal()) {
            l1.setNext(mergeTwoLists(l1.getNext(), l2));
            return l1;
        } else {
            l2.setNext(mergeTwoLists(l1, l2.getNext()));
            return l2;
        }
    }

    private static void printList(ListNode node) {
        System.out.println();
        ListNode current = node;

        while(current != null) {
            System.out.println(current.getVal() + " ");
            current = current.getNext();
        }

        System.out.println();
    }
}
