// Time Complexity - O(nlog(n)) 
// Spac Complexity - O(n)

class Solution {
	public String largestNumber(int[] nums) {
		int len = nums.length;
		if (len == 0) {
			return "";
		}

		String[] sa = new String[len];
		for (int i = 0; i<len; i++) {
			sa[i] = Integer.toString(nums[i]);
		}

		Arrays.sort(sa, new Comparator<String> () {
			public int compare(String a, String b) {
				String o1 = a + b;
				String o2 = b + a;

				return o2.compareTo(o1);
			}
		});

		if (sa[0].equals("0")) {
			return "0";
		}

		StringBuilder s = new StringBuilder("");
		for (String val: sa) {
			s.append(val);
		}

		return s.toString();
	}
}