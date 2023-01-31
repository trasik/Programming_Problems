package Jan312023;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Driver {

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;

        int[] nums2 = {3,2,4};
        int target2 = 6;

        int[] nums3 = {3,3};
        int target3 = 6;

        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
    }

    public static int[] twoSum(int[] nums, int target) {
        if(nums.length == 0) return new int[2];
        int[] result = new int[2];
        Map<Integer, Integer> complements = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if(complements.containsKey(complement)) {
                result[0] = complements.get(complement);
                result[1] = i;
                return result;
            } else {
                complements.put(nums[i], i);
            }
        }

        result[0] = -1;
        result[1] = -1;
        return result;
    }
}
