package in.tasks;

public class Question7 {

	public static boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                isDecreasing = false;
            }
            if (nums[i] < nums[i - 1]) {
                isIncreasing = false;
            }
        }

        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        boolean isMonotonic = isMonotonic(nums);
        System.out.println(isMonotonic); 
    }
}

