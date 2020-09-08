// Time Complexity - O(n)
// Space Complexity - O(h) h=height of tree(space for recursion stack)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
	int totalSum = 0;
	public int sumRootToLeaf(TreeNode root) {
		getPathSum(root, 0);
		return totalSum;
	}

	private void getPathSum(TreeNode r, int currSum) {
		if (r != null) {
			currSum = (currSum<< 1) | r.val;
			if (r.left == null && r.right == null) {
				totalSum += currSum;
			}

			getPathSum(r.left, currSum);
			getPathSum(r.right, currSum);
		}
	}
}