package Feb152023;

import java.util.*;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: 3Sum
        int[] nums1 = {-1,0,1,2,-1,-4};
        int[] nums2 = {0,1,1};
        int[] nums3 = {0,0,0};

        System.out.println(Arrays.toString(threeSum(nums1).toArray()));
        System.out.println(Arrays.toString(threeSum(nums2).toArray()));
        System.out.println(Arrays.toString(threeSum(nums3).toArray()));
    }

    //Problem 1: 3Sum
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();
        if(nums.length == 0) return new ArrayList<>(answer);

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0) {
                    List<Integer> newResult = new ArrayList<>();
                    newResult.add(nums[i]);
                    newResult.add(nums[j++]);
                    newResult.add(nums[k--]);
                    answer.add(newResult);
                } else if(sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return new ArrayList<>(answer);
    }
}
