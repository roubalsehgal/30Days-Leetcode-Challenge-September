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
	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		ArrayList<Integer> firstTree = new ArrayList<>();
		ArrayList<Integer> secondTree = new ArrayList<>();

		getInOrder(root1, firstTree);
		getInOrder(root2, secondTree);

		ArrayList<Integer> res = new ArrayList<>();
		for (int i = 0; i<firstTree.size(); i++) {
			res.add(firstTree.get(i));
		}

		for (int j = 0; j<secondTree.size(); j++) {
			res.add(secondTree.get(j));
		}
		Collections.sort(res);

		return res;
	}

	private ArrayList<Integer> getInOrder(TreeNode root, ArrayList<Integer> al) {
		if (root == null)
			return null;

		getInOrder(root.left, al);
		al.add(root.val);
		getInOrder(root.right, al);

		return al;
	}
}