package Jan122023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1
        ListNode firstList1 = new ListNode(1);
        firstList1.next = new ListNode(2);
        firstList1.next.next = new ListNode(4);

        ListNode secondList1 = new ListNode(1);
        secondList1.next = new ListNode(3);
        secondList1.next.next = new ListNode(4);

        printList(mergeTwoLists(firstList1, secondList1));

        //Problem 2
        
    }

    //Problem 1
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void printList(ListNode node) {
        ListNode current = node;
        while(current != null) {
            System.out.print(current.val + ",");
            current = current.next;
        }
        System.out.println();
    }
}
