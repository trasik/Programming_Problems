package Feb202023;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Intersection of Two Arrays
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] nums1b = {4,9,5};
        int[] nums2b = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
        System.out.println(Arrays.toString(intersection(nums1b, nums2b)));
    }

    //Problem 1: Intersection of Two Arrays
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        for(int num : nums1) nums1Set.add(num);

        for(int num : nums2) {
            if(nums1Set.contains(num)) intersect.add(num);
        }

        int[] intersectArr = new int[intersect.size()];
        int i = 0;

        for(Integer num : intersect) {
            intersectArr[i++] = num;
        }

        return intersectArr;
    }
}
