package in.tasks;

import java.util.Arrays;

public class Question1 {
	
	public static int maxArrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int pairSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            pairSum += nums[i];
        }
        return pairSum;
    }

    public static void main(String[] args) {
        int[] nums = {7,4, 3, 2};
        int maxSum = maxArrayPairSum(nums);
        System.out.println(maxSum); 
    }

}
