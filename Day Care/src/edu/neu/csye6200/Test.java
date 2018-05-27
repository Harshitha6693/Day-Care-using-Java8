package edu.neu.csye6200;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    System.out.println(map);
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	        	System.out.println(map.get(complement));
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	} 
	
	public static void main(String[] args) {
		Test a = new Test();
		int[] ab = {2,3,5,7};
		a.twoSum(ab,9);
	}
}
