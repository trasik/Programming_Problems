package Jan292023;

import java.util.Stack;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Remove Nth Node from End of List
        ListNode root1 = new ListNode(1);
        root1.next = new ListNode(2);
        root1.next.next = new ListNode(3);
        root1.next.next.next = new ListNode(4);
        root1.next.next.next.next = new ListNode(5);

        printLinkedList(removeNthFromEnd(root1, 2));

        //Problem 2: Palindrome Linked List
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(2);
        list1.next.next.next = new ListNode(1);
        System.out.println("Is Palindrome?: " + isPalindrome(list1));

        //Problem 3: Odd Even Linked List
        ListNode oddEven = new ListNode(1);
        oddEven.next = new ListNode(2);
        oddEven.next.next = new ListNode(3);
        oddEven.next.next.next = new ListNode(4);
        oddEven.next.next.next.next = new ListNode(5);

        printLinkedList(oddEvenList(oddEven));

    }

    //Problem 1: Remove Nth Node from End of List
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while(n > 0) {
            fast = fast.next;
            n--;
        }

        if(fast == null) {
            head = head.next;
            return head;
        }

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    //Problem 2: Palindrome Linked List
    public static boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;

        //Push every node onto the stack
        while(current != null) {
            stack.push(current);
            current = current.next;
        }

        //Reset the pointer and pop the last nodes in the list;
        //If the values aren't equal then return false as a palindrome doesn't exist
        current = head;
        while(current != null) {
            ListNode check = stack.pop();
            if(current.val != check.val) return false;
            current = current.next;
        }

        return true;
    }

    //Problem 3: Odd Even Linked List
    public static ListNode oddEvenList(ListNode head) {
        if(head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    //Helper
    private static void printLinkedList(ListNode node) {
        ListNode current = node;
        while(current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        System.out.println();
    }
}
