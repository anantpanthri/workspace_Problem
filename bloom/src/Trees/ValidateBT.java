package Trees;

public class ValidateBT {

	public static void main(String[] args) {
		TreeNode a =TreeNode.populateBinaryTree();
		System.out.print(isValidBST(a,Long.MIN_VALUE, Long.MAX_VALUE));
	}

	private static boolean isValidBST(TreeNode root,long minVal, long maxVal) {
		if (root == null) return true;
		if (root.val >= maxVal || root.val <= minVal) return false;
		return isValidBST(root.left, minVal, root.val) && 
			   isValidBST(root.right, root.val, maxVal);
	}
}

