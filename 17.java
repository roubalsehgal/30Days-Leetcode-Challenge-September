// Time Complexity - O(n)

class Solution {
	public boolean isRobotBounded(String instructions) {
		int direction = 0;
		int pos[] = new int[] { 0, 0 };

		for (char instruction: instructions.toCharArray()) {
			if (instruction == 'L') {
				direction = ++direction % 4;
			} else if (instruction == 'R') {
				direction--;
				if (direction<0) {
					direction = 3;
				}
			} else {
				if (direction == 0) {
					pos[1]++;
				} else if (direction == 1) {
					pos[0]--;
				} else if (direction == 2) {
					pos[1]--;
				} else {
					pos[0]++;
				}
			}

		}
		return (pos[0] == 0 && pos[1] == 0) ? true : (direction != 0);
	}
}