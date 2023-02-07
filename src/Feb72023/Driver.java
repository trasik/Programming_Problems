package Feb72023;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Contains Duplicate
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(Arrays.toString(nums1) + " Contains Duplicates?: " + containsDuplicate(nums1));
        System.out.println(Arrays.toString(nums2) + " Contains Duplicates?: " + containsDuplicate(nums2));
        System.out.println(Arrays.toString(nums3) + " Contains Duplicates?: " + containsDuplicate(nums3));

        //Problem 2: Maximum Subarray
        int[] nums2a = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2b = {5,4,-1,7,8};

        System.out.println(Arrays.toString(nums2a) + " Maximum Sum in Subarray: " + maxSubArray(nums2a));
        System.out.println(Arrays.toString(nums2b) + " Maximum Sum in Subarray: " + maxSubArray(nums2b));
    }

    //Problem 1: Contains Duplicate
    public static boolean containsDuplicate(int[] nums) {
        if(nums.length == 0) return false;

        Set<Integer> seen = new HashSet<>();

        for(int num : nums) {
            if(seen.contains(num)) return true;
            seen.add(num);
        }

        return false;
    }

    //Problem 2: Maximum Subarray
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int currentSum = 0;

        for(int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if(currentSum < nums[i]) currentSum = nums[i];
            if(currentSum > max) max = currentSum;
        }

        return max;
    }
}
