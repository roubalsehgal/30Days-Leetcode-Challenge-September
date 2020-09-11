// Time Complexity - O(n)

class Solution {
	public int maxProduct(int[] nums) {

		int max = nums[0];
		int currMax = nums[0];
		int currMin = nums[0];

		for (int i = 1; i<nums.length; i++) {
			int nextMax = currMax * nums[i];
			int nextMin = currMin * nums[i];

			currMax = Math.max(nums[i], Math.max(nextMax, nextMin));
			currMin = Math.min(nums[i], Math.min(nextMax, nextMin));

			max = Math.max(currMax, max);
		}

		return max;
	}
}