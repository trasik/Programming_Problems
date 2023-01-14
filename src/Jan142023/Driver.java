package Jan142023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1
        ListNode list1 = new ListNode(3);
        ListNode cycle = new ListNode(2);
        list1.next = cycle;
        list1.next.next = new ListNode(0);
        list1.next.next.next = new ListNode(-4);
        list1.next.next.next.next = cycle;

        System.out.println(detectCycle(list1).val);

        //Problem 2

        int[] firstSet = {7,1,5,3,6,4};
        int[] secondSet = {7,6,4,3,1};
        int[] emptySet = {};
        int[] nullSet = null;

        System.out.println(maxProfit(firstSet));
        System.out.println(maxProfit(secondSet));
        System.out.println(maxProfit(emptySet));
        System.out.println(maxProfit(nullSet));
    }

    //Problem 1
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

    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return -1;

        int buy = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < buy) buy = prices[i];
            profit = Math.max(profit, prices[i] - buy);
        }

        return profit;
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
