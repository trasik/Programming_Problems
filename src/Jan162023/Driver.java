package Jan162023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Binary Search
        int[] firstSet = {-1,0,3,5,9,12};
        int[] secondSet = {-1,0,3,5,9,12};

        System.out.println("Index: " + search(firstSet, 9));
        System.out.println("Index: " + search(secondSet, 2));

        //Problem 2: First Bad Version
        //No testing for function as API call isBadVersion is missing
    }

    private static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        return -1;
    }

    /*Problem 2
    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }

        return start;
    }*/
}
