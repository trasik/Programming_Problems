package Jan82023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1
        int[] firstSet = {1,0,2,3,0,4,5,0};
        int[] secondSet = {1,2,3};
        int[] emptySet = {};
        int[] nullSet = null;

        duplicateZeros(firstSet);
        duplicateZeros(secondSet);
        duplicateZeros(emptySet);
        duplicateZeros(nullSet);

        printArray(firstSet);
        printArray(secondSet);

        //Problem 2
        int[] firstSet2a = {1,2,3,0,0,0};
        int[] firstSet2b = {2,5,6};
        int[] secondSet2a = {1};
        int[] secondSet2b = {};
        int[] thirdSet2a = {0};
        int[] thirdSet2b = {1};

        merge(firstSet2a, 3, firstSet2b, 3);
        merge(secondSet2a, 1, secondSet2b, 0);
        merge(thirdSet2a, 0, thirdSet2b, 1);

        printArray(firstSet2a);
        printArray(secondSet2a);
        printArray(thirdSet2a);

        //Problem 3
        int[] firstSet3 = {3,2,2,3};
        int firstVal = 3;
        int[] secondSet3 = {0,1,2,2,3,0,4,2};
        int secondVal = 2;

        int firstAnswer = removeElement(firstSet3, firstVal);
        System.out.println(firstAnswer);
        printArray(firstSet3, firstAnswer);

        int secondAnswer = removeElement(secondSet3, secondVal);
        System.out.println(secondAnswer);
        printArray(secondSet3, secondAnswer);

        //Problem 4
        int[] firstSet4 = {1,1,2};
        int[] secondSet4 = {0,0,1,1,1,2,2,3,3,4};

        int firstAnswer4 = removeDuplicates(firstSet4);
        int secondAnswer4 = removeDuplicates(secondSet4);

        System.out.println(firstAnswer4);
        printArray(firstSet4, firstAnswer4);
        System.out.println(secondAnswer4);
        printArray(secondSet4, secondAnswer4);

    }

    //Problem 1
    public static void duplicateZeros(int[] arr) {
        if(arr == null || arr.length == 0) return;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                shiftAndAddZero(arr, i);
                i++;
            }
        }
    }

    private static void shiftAndAddZero(int[] arr, int index) {
        for(int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = 0;
    }

    private static void printArray(int[] arr) {
        for(int a : arr) {
            System.out.print(a + ",");
        }
        System.out.println();
    }

    private static void printArray(int[] arr, int index) {
        if(index > arr.length || index < 0) return;

        for(int i = 0; i < index; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    //Problem 2
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while(p1 >= 0 && p2 >= 0) {
            nums1[p3--] = (nums1[p1] > nums2[p2]) ? nums1[p1--] : nums2[p2--];
        }

        while(p2 >= 0) {
            nums1[p3--] = nums2[p2--];
        }
    }

    //Problem 3
    public static int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) return 0;

        int removeIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[removeIndex++] = nums[i];
            }
        }

        return removeIndex;
    }

    //Problem 4
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int dupeIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                nums[dupeIndex++] = nums[i];
            }
        }

        return dupeIndex;
    }
}
