package in.tasks;

import java.util.Arrays;

public class Question8 {

	 public static int minimumScore(int[] nums, int k) {
	        int minVal = Arrays.stream(nums).min().getAsInt();
	        int maxVal = Arrays.stream(nums).max().getAsInt();
	        int initialScore = maxVal - minVal;

	        if (initialScore <= 2 * k) {
	            return initialScore;
	        }

	        int midpoint = (minVal + maxVal) / 2;

	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] < midpoint) {
	                nums[i] += k;
	            } else if (nums[i] > midpoint) {
	                nums[i] -= k;
	            }
	        }

	        int newMinVal = Arrays.stream(nums).min().getAsInt();
	        int newMaxVal = Arrays.stream(nums).max().getAsInt();

	        return newMaxVal - newMinVal;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1};
	        int k = 0;
	        int minScore = minimumScore(nums, k);
	        System.out.println(minScore); // Output: 0
	    }
	}