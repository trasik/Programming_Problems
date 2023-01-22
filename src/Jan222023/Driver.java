package Jan222023;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Two Sum
        int[] arr1 = {2,7,11,15};
        int target1 = 9;

        int[] arr2 = {3,2,4};
        int target2 = 6;

        int[] arr3 = {3, 3};
        int target3 = 6;

        System.out.println(Arrays.toString(twoSum(arr1, target1)));
        System.out.println(Arrays.toString(twoSum(arr2, target2)));
        System.out.println(Arrays.toString(twoSum(arr3, target3)));

        //Problem 2: Bulls and Cows
        String secret1 = "1807";
        String guess1 = "7810";

        String secret2 = "1123";
        String guess2 = "0111";

        System.out.println(getHint(secret1, guess1));
        System.out.println(getHint(secret2, guess2));
    }

    //Problem 1: Two Sum
    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums == null || nums.length == 0) return result;

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

    //Problem 2: Bulls and Cows
    public static String getHint(String secret, String guess) {
        if(guess.length() > secret.length()) return "";

        int[] sCount = new int[10];
        int[] gCount = new int[10];
        int bulls = 0;
        int cows = 0;

        for(int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if(s == g) {
                bulls++;
            } else {
                sCount[s - '0']++;
                gCount[g - '0']++;
            }
        }

        for(int i = 0; i < sCount.length; i++) {
            cows += Math.min(sCount[i], gCount[i]);
        }

        return bulls + "A" + cows + "B";
    }
}
