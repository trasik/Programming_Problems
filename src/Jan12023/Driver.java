package Jan12023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1
        int[] firstSet = {1, 1, 0, 1, 1, 1};
        int[] secondSet = {1, 0, 1, 1, 0, 1};
        int[] emptySet = {};
        int[] nullSet = null;
        System.out.println(findMaxConsecutiveOnes(firstSet));
        System.out.println(findMaxConsecutiveOnes(secondSet));
        System.out.println(findMaxConsecutiveOnes(emptySet));
        System.out.println(findMaxConsecutiveOnes(nullSet));

        //Problem 2

        int[] firstSet2 = {12,345,2,6,7896};
        int[] secondSet2 = {555,901,482,1771};
        System.out.println(findNumbers(firstSet2));
        System.out.println(findNumbers(secondSet2));
        System.out.println(findNumbers(emptySet));
        System.out.println(findNumbers(nullSet));

        //Problem 3

        int[] firstSet3 = {-4,-1,0,3,10};
        int[] secondSet3 = {-7,-3,2,3,11};

        printArray(sortedSquares(firstSet3));
        printArray(sortedSquares(secondSet3));
        printArray(sortedSquares(emptySet));
        printArray(sortedSquares(nullSet));
    }

    //Problem One
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

    //Problem 2
    private static int findNumbers(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        int total = 0;

        for (int num : nums) {
            if (totalDigits(num) % 2 == 0) total++;
        }

        return total;
    }

    private static int totalDigits(int num) {
        int digits = 0;

        while(num > 0) {
            digits++;
            num /= 10;
        }

        return digits;
    }

    //Problem 3
    private static int[] sortedSquares(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];
        int start = 0;
        int end = nums.length - 1;
        int k = nums.length - 1;
        int[] result = new int[nums.length];

        while(start <= end) {
            if(Math.abs(nums[start]) > Math.abs(nums[end])) {
                result[k--] = nums[start] * nums[start];
                start++;
            } else {
                result[k--] = nums[end] * nums[end];
                end--;
            }
        }

        return result;
    }

    private static void printArray(int[] arr) {
        for(int a : arr) {
            System.out.print(a + ",");
        }
        System.out.println();
    }
}
