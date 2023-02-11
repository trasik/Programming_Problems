package Feb112023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Search in Rotated Array
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;
        int target2 = 3;

        System.out.println("Index In Rotated Array: " + search(nums1, target1));
        System.out.println("Index In Rotated Array: " + search(nums1, target2));
    }

    //Problem 1: Search in Rotated Array
    public static int search(int[] nums, int target) {
        if(nums.length == 0) return -1;

        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[end]) start = mid + 1;
            else end = mid;
        }

        int rotatedStart = start;
        start = 0;
        end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int rotatedMid = (mid + rotatedStart) % nums.length;

            if(nums[rotatedMid] == target) return rotatedMid;
            if(nums[rotatedMid] < target) start = mid + 1;
            else end = mid - 1;
        }

        return -1;
    }


}
