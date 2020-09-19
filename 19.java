// Reference: https://leetcode.com/problems/sequential-digits/discuss/451901/java-0ms-Solution-with-explanation

class Solution {
	public List<Integer> sequentialDigits(int low, int high) {
		final int max = 123456789;
		int start = 12, seed = start;
		int additive = 11;
		boolean flag = false;
		List<Integer> list = new ArrayList<Integer> ();
		while (seed<= high && seed<= max) {
			if (seed >= low && seed<= high) {
				list.add(seed);
			}
			if (!flag) {
				seed += additive;
				if (seed % 10 == 9) {
					additive = additive * 10 + 1;
					flag = true;
				}
			} else {
				start = (start * 10) + (start % 10) + 1;
				seed = start;
				flag = false;
			}
		}
		return list;
	}
}