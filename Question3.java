package in.tasks;

import java.util.HashMap;
import java.util.Map;

public class Question3 {

	 public static int findLHS(int[] nums) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int num : nums) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        int maxLen = 0;
	        for (int num : map.keySet()) {
	            if (map.containsKey(num + 1)) {
	                int currentLen = map.get(num) + map.get(num + 1);
	                maxLen = Math.max(maxLen, currentLen);
	            }
	        }

	        return maxLen;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
	        int longestLength = findLHS(nums);
	        System.out.println(longestLength); 
	    }
}
	

	

