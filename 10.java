// Time Complexity - O(n)
// Space Complexity - O(1)


class Solution {
    public String getHint(String secret, String guess) {
        int[] aMap = new int[10];
        int[] bMap = new int[10];
        int A = 0, B = 0;
        for (int i = 0; i<guess.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                A++;
            } else {
                aMap[secret.charAt(i) - '0']++;
                bMap[guess.charAt(i) - '0']++;
            }
        }
        for (int i = 0; i<10; i++) {
            B += Math.min(aMap[i], bMap[i]);
        }
        return A + "A" + B + "B";
    }
}