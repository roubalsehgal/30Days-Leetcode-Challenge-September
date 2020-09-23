// Time Complexity - O(n)

class Solution {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int start = 0;
		int total = 0;
		int sumGasLeft = 0;
		for (int i = 0; i<gas.length; i++) {
			int currentGasLeft = gas[i] - cost[i];
			if (sumGasLeft >= 0) {
				sumGasLeft += currentGasLeft;
			} else {
				sumGasLeft = currentGasLeft;
				start = i;
			}
			total += currentGasLeft;
		}
		return total >= 0 ? start : -1;
	}
}