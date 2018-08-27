package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;
	TreeNode next;
	
	TreeNode (int x){
		val=x;
	}
	TreeNode (){
	}
	
	
	public static TreeNode populateTree() {
		TreeNode a= new TreeNode(10);
		TreeNode b= new TreeNode(2);
		TreeNode c= new TreeNode(7);
		TreeNode d= new TreeNode(1);
		TreeNode e= new TreeNode(3);
		TreeNode f= new TreeNode(6);
		TreeNode g= new TreeNode(9);
		
		a.left=b;
		a.right=c;
		b.left=d;
		b.right=e;
		c.left=f;
		c.right=g;
		
		return a;
	}
	public static TreeNode populateBinaryTree() {
		TreeNode a= new TreeNode(0);
		TreeNode b= new TreeNode(1);
		a.right=b;
		return a;
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
}
