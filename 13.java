// Time Complexity - O(n)

class Solution {
	public int[][] insert(int[][] intervals, int[] newInterval) {
		int[][] res = new int[intervals.length + 1][2];
		int k = 0;

		res[k] = newInterval;
		for (int i = 0; i<intervals.length; i++) {
			int[] curr = intervals[i];
			if (curr[1]<res[k][0]) {
				res[k + 1] = res[k];
				res[k] = curr;
				k++;
			} else if (res[k][1]<curr[0]) {
				res[++k] = curr;
			} else {
				int start = Math.min(res[k][0], curr[0]);
				int end = Math.max(res[k][1], curr[1]);
				res[k] = new int[] {
					start, end
				};
			}
		}

		return Arrays.copyOf(res, k + 1);
	}
}