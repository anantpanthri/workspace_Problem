package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

	public static void main(String[] args) {
		TreeNode a=TreeNode.populateTree();
		//inorderTraversal(a);
		//preorderTraversal(a);
		invertBT(a);
		LevelOrderTraversal(a);
	}

	private static void LevelOrderTraversal(TreeNode a) {
		Queue<TreeNode>q= new LinkedList<TreeNode>();
		q.offer(a);
		while(!q.isEmpty()) {
			TreeNode temp=q.poll();
			if(temp!=null) {
				System.out.print(temp.val+",");
					q.offer(temp.left);//20pcnt
					q.offer(temp.right);//20pcnt

			}
			System.out.println();
			
		}
	}

	private static void invertBT(TreeNode a) {

		Queue<TreeNode>q= new LinkedList<TreeNode>();
		q.offer(a);
		while(!q.isEmpty()) {
			TreeNode temp=q.poll();
			if(temp!=null) {
				    TreeNode cur=temp.left;
					temp.left=temp.right;
					temp.right=cur;
					 q.offer(temp.left);
					q.offer(temp.right);
				 }

			}
			
		}
	
	

	private static void inorderTraversal(TreeNode a) {
			if(a==null)
				return ;
			inorderTraversal(a.left);
			System.out.print(a.val+",");
			inorderTraversal(a.right);
	}
	
	private static void preorderTraversal(TreeNode a) {
		if(a==null)
			return ;
		System.out.print(a.val+",");
		inorderTraversal(a.left);
		inorderTraversal(a.right);
}

}
