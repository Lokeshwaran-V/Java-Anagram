package com.leetcode;

import java.util.Scanner;

public class TwoSum {
	static void twoSum() {
		System.out.println("Enter the array size");
		Scanner s = new Scanner(System.in);
		
		int arraySize = s.nextInt();
		int[] nums = new int [arraySize];
		
		System.out.println("Enter the array values");
		for (int i=0;i < arraySize;i++) {
			nums[i] = s.nextInt();
		}
		
		System.out.println("Enter the target value");
		int targetValue = s.nextInt();
        
        for(int a=0;a < nums.length -1;a++) {
        	for(int b=a+1;b < nums.length;b++) {
            	if (nums[a]+nums[b] == targetValue) {
            		System.out.println(a + "," + b);
            		System.out.println(nums[a]+" + " +nums[b]);
            	}
            	else {
//            		System.out.println("Values in the array cannot get the target value");
            	}
            }
        	
        } 
	}
    public static void main(String [] args) {
    	twoSum();
    }
}