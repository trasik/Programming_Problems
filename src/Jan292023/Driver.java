package Jan292023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Remove Nth Node from End of List
        ListNode root1 = new ListNode(1);
        root1.next = new ListNode(2);
        root1.next.next = new ListNode(3);
        root1.next.next.next = new ListNode(4);
        root1.next.next.next.next = new ListNode(5);

        printLinkedList(removeNthFromEnd(root1, 2));
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
