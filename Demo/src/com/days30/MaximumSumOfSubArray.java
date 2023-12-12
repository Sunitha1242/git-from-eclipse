package com.days30;

public class MaximumSumOfSubArray {
	public static int maxSubArraySum(int[] nums) {
	int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer value
	//	int maxSum = 0; // Initialize maxSum to the smallest possible integer value

		int currentSum = 0; // Initialize currentSum to 0
		//System.out.println(Integer.MIN_VALUE);
		for (int i = 0; i < nums.length; i++) {
			currentSum += nums[i]; // Add the current element to current//lasya Sum

			// If currentSum becomes negative, reset it to 0
			if (currentSum < 0) {
				currentSum = 0;
			}
//lasya
			// Update maxSum if currentSum is greater
			if (currentSum > maxSum) {
				maxSum = currentSum;
		//sum of 10 + 10 = 20	}
		}
//lasya
		return maxSum; // Return the maximum subarray sum
	}
//lasya
	public static void main(String[] args) {
		//int[] input = { -2, -3, 4, -1, -2, 1, 5, -3 };
		//int[] input = { -2, -3, -4, -1, -2,-1, -5, -3 };
		int[] input = { 32, 3, 4, 1, 2, 1, 5, 3 };

		int maxSum = maxSubArraySum(input);
		System.out.println("Maximum subarray sum: " + maxSum);
	}
}
