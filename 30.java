public class Solution {
	public int firstMissingPositive(int[] A) {
		int i = 0;
		while (i<A.length) {
			if (A[i]<= 0 || A[i] > A.length || A[A[i] - 1] == A[i]) {
				i++;
			} else {
				swap(A, i, A[i] - 1);
			}
		}
		i = 0;
		while (i<A.length && A[i] == i + 1) {
			i++;
		}
		return i + 1;
	}

	private void swap(int[] A, int i, int j) {
		A[i] = A[i] ^ A[j];
		A[j] = A[i] ^ A[j];
		A[i] = A[i] ^ A[j];
	}
}