package Jan102023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1
        int[] firstSet = {1,2,3,4};
        int[] secondSet = {1,1,1,1,1};
        int[] thirdSet = {3,1,2,10,1};
        int[] emptySet = {};
        int[] nullSet = null;

        printArray(runningSum(firstSet));
        printArray(runningSum(secondSet));
        printArray(runningSum(thirdSet));
        printArray(runningSum(emptySet));
        printArray(runningSum(nullSet));

        //Problem 2
        int[] firstSet2 = {1,7,3,6,5,6};
        int[] secondSet2 = {1,2,3};
        int[] thirdSet2 = {2,1,-1};

        System.out.println(pivotIndex(firstSet2));
        System.out.println(pivotIndex(secondSet2));
        System.out.println(pivotIndex(thirdSet2));
        System.out.println(pivotIndex(emptySet));
        System.out.println(pivotIndex(nullSet));
    }

    //Problem 1
    public static int[] runningSum(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];

        int[] result = new int[nums.length];
        int sum = nums[0];
        result[0] = sum;

        for(int i = 1; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }

        return result;
    }

    //Problem 2
    public static int pivotIndex(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        int totalSum = 0;
        int leftSum = 0;

        for(int num : nums) totalSum += num;

        for(int i = 0; i < nums.length; i++) {
            if(leftSum == totalSum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }

        return -1;
    }

    //Helper Functions
    private static void printArray(int[] arr) {
        for(int a : arr) {
            System.out.print(a + ",");
        }
        System.out.println();
    }
}
