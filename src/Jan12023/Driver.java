package Jan12023;

public class Driver {

    public static void main(String[] args) {
        int[] firstSet = {1, 1, 0, 1, 1, 1};
        int[] secondSet = {1, 0, 1, 1, 0, 1};
        int[] thirdSet = {};
        int[] fourthSet = null;
        System.out.println(findMaxConsecutiveOnes(firstSet));
        System.out.println(findMaxConsecutiveOnes(secondSet));
        System.out.println(findMaxConsecutiveOnes(thirdSet));
        System.out.println(findMaxConsecutiveOnes(fourthSet));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0) return -1;

        int maxOnes = 0;
        int consecutiveOnes = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                consecutiveOnes++;
                maxOnes = Math.max(maxOnes, consecutiveOnes);
            } else {
                consecutiveOnes = 0;
            }
        }

        return maxOnes;
    }
}
