class Solution {
	public boolean repeatedSubstringPattern(String s) {
		int len = s.length();
		if (len<= 1) {
			return false;
		}

		ArrayList<Integer> factors = new ArrayList<>();
		for (int j = 1; j<len; j++) {
			if (len % j == 0) {
				factors.add(j);
			}
		}

		for (int i = 0; i<factors.size(); i++) {
			String subStr = s.substring(0, factors.get(i));
			String temp = "";
			while (true) {
				if (temp.length() >= len) {
					break;
				}
				temp += subStr;
			}
			if (temp.equals(s)) {
				return true;
			}
		}
		return false;
	}
}