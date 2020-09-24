// Time Complexity - O(n) n is length of string s

class Solution {
	public char findTheDifference(String s, String t) {
		int ch = 0;
		int i = 0;
		for (i = 0; i<s.length(); i++) {
			int chs = (int) s.charAt(i);
			int cht = (int) t.charAt(i);
			ch = (ch ^ (chs ^ cht));
		}
		ch = ch ^ (int) t.charAt(i);
		return (char) ch;
	}
}