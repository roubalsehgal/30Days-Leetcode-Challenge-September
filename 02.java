// Time Complexity - O(n^2)
// Trying to do it with less time

class Solution {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		int len = nums.length;
		for (int i = 0; i<len; i++) {
			for (int j = i + 1; j<len; j++) {
				if (Math.abs(1 L * nums[i] - nums[j])<= t && j - i<= k) {
					return true;
				}
			}
		}
		return false;
	}
}