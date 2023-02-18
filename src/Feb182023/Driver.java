package Feb182023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Summary Ranges
        int[] arr1 = {0,1,2,4,5,7};
        int[] arr2 = {0,2,3,4,6,8,9};

        System.out.println(Arrays.toString(summaryRange(arr1).toArray()));
        System.out.println(Arrays.toString(summaryRange(arr2).toArray()));

        //Problem 2: Range Sum Query - Immutable
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});

        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }

    //Problem 1: Summary Ranges
    public static List<String> summaryRange(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 1) {
            result.add(nums[0] + "");
            return result;
        }

        for(int i = 0; i < nums.length; i++) {
            int start = nums[i];

            while(i + 1 < nums.length && nums[i + 1] - nums[i] == 1) i++;

            if(start != nums[i]) result.add(start + "->" + nums[i]);
            else result.add(start + "");
        }

        return result;
    }
}
