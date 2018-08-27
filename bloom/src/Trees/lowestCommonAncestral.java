package Trees;
import java.util.*;

public class lowestCommonAncestral {

	public static void main(String[] args) {
		TreeNode r= new TreeNode();
		r=r.populateTree();
		TreeNode low= getLCA(r);
		System.out.println(low.val);
		System.out.println();
		levelordertraversal(r);
	}

	private static void levelordertraversal(TreeNode r) {
		Queue<TreeNode> q= new LinkedList<TreeNode>();
		q.offer(r);
		while(!q.isEmpty()) {
			TreeNode tmp= q.poll();
			System.out.print(tmp.val+",");
			if(tmp!=null) {
			if(tmp.left!=null)
			q.offer(tmp.left);	
			if(tmp.right!=null)
				q.offer(tmp.right);
			}
		}
	}

	private static TreeNode getLCA(TreeNode r) {
		int n1=6, n2=9;
		return getLCA(n1,n2,r);
	}

	private static TreeNode getLCA(int n1, int n2, TreeNode r) {
		if(r==null)
			return null;
		if(r.val==n1||r.val==n2)return r;
		TreeNode left=getLCA(n1,n2,r.left);
		TreeNode right=getLCA(n1,n2,r.right);
		return left!=null?left:right;
	}
}
