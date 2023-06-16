package in.tasks;

import java.util.HashSet;
import java.util.Set;

public class Question2 {

	public static int MinTypeOfCandy(int[] candies) {
		int maxAllowed=candies.length/2;
		Set<Integer> set =new HashSet<Integer>();
		for(int num:candies)
			set.add(num);
		
		if(maxAllowed<set.size())
			return maxAllowed;
		else
			return set.size();
				
	}

	public static void main(String[] args) {
		
		int candies[]= {1,1,2,2,2,3,3,4};
		System.out.println("Allowed type of candies are :: "+MinTypeOfCandy(candies));
	}
	
}
