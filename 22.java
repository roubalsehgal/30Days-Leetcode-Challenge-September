// Time Complexity - O(n)
// Space Complexity - O(1)

// Moore's Voting Algorithm

class Solution {
	public List<Integer> majorityElement(int[] nums) {
		int first = -1, second = -1;
		int count1 = 0, count2 = 0;

		int len = nums.length;
		for (int i = 0; i<len; i++) {
			if (first == nums[i]) {
				count1++;
			} else if (second == nums[i]) {
				count2++;
			} else if (count1 == 0) {
				first = nums[i];
				count1++;
			} else if (count2 == 0) {
				second = nums[i];
				count2++;
			} else {
				count1--;
				count2--;
			}
		}

		List<Integer> ans = new ArrayList<>();
		count1 = 0;
		count2 = 0;

		for (int j = 0; j<len; j++) {
			if (nums[j] == first)
				count1++;
			if (nums[j] == second)
				count2++;
		}

		if (count1 > len / 3) {
			ans.add(first);
		}
		if (count2 > len / 3) {
			ans.add(second);
		}
		return ans;
	}
}