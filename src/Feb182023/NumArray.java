package Feb182023;

public class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        if(left > right) return -1;
        int sum = 0;
        while(left <= right) sum += this.nums[left++];

        return sum;
    }

    public int[] getNums() {
        return this.nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }
}
