package Jan142023;

public class Driver {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(3);
        ListNode cycle = new ListNode(2);
        list1.next = cycle;
        list1.next.next = new ListNode(0);
        list1.next.next.next = new ListNode(-4);
        list1.next.next.next.next = cycle;

        System.out.println(detectCycle(list1).val);
    }

    public static ListNode detectCycle(ListNode head) {
        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == null) return null;

            if(slow == fast) {
                slow = head;

                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }

    public static void printList(ListNode node) {
        ListNode current = node;

        while(current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
