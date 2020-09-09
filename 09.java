// Time Complexity - O(n)
// Space Complexity - O(n1 + n2)

 
class Solution {
	public int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");

		int len = Math.min(v1.length, v2.length);
		int i = 0;

		while (i<len) {
			if (Integer.valueOf(v1[i]) > Integer.valueOf(v2[i])) {
				return 1;
			}
			if (Integer.valueOf(v1[i])<Integer.valueOf(v2[i])) {
				return -1;
			}
			i++;
		}

		while (i<v1.length) {
			if (Integer.valueOf(v1[i]) != 0) {
				return 1;
			}
			i++;
		}

		while (i<v2.length) {
			if (Integer.valueOf(v2[i]) != 0) {
				return -1;
			}
			i++;
		}
		return 0;
	}
}