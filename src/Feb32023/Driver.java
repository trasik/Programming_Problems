package Feb32023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Search Insert Position
        int[] arr = {1,3,5,6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;

        System.out.println("Insert Index: " + searchInsert(arr, target1));
        System.out.println("Insert Index: " + searchInsert(arr, target2));
        System.out.println("Insert Index: " + searchInsert(arr, target3));
    }

    //Problem 1: Search Insert Position
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0) return -1;

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        return start;
    }
}
