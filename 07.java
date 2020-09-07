// Time Complexity - O(N)
// Space Complexity - O(N)

class Solution {
	public boolean wordPattern(String pattern, String str) {
		String[] words = str.split("\\s");
		int pLen = pattern.length();
		int sLen = words.length;

		if (pLen != sLen) {
			return false;
		}

		HashMap<Character, String> map = new HashMap<>();
		for (int i = 0; i<pLen; i++) {
			if (!map.containsKey(pattern.charAt(i)) && map.containsValue(words[i])) {
				return false;
			}
			map.put(pattern.charAt(i), words[i]);
		}

		for (int j = 0; j<pLen; j++) {
			if (!map.get(pattern.charAt(j)).equals(words[j])) {
				return false;
			}
		}
		return true;
	}
}