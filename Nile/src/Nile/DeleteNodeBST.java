package Nile;
import java.util.*;
public class DeleteNodeBST {
	/*
	 * 						12
	 * 			5						15
	 * 		3		7			13					17
	 * 1				9			14			20
	 * 				8		11				18		
	 * 										
	 * 
	 */

	public static TreeNode constructBST() {
		TreeNode a=new TreeNode(12);
		TreeNode b=new TreeNode(5);
		TreeNode c=new TreeNode(15);
		TreeNode d=new TreeNode(3);
		TreeNode e=new TreeNode(7);
		TreeNode f=new TreeNode(13);
		TreeNode g=new TreeNode(17);
		TreeNode h=new TreeNode(1);
		TreeNode i=new TreeNode(9);
		TreeNode j=new TreeNode(14);
		TreeNode k=new TreeNode(20);
		TreeNode l=new TreeNode(8);
		TreeNode m=new TreeNode(11);
		TreeNode n=new TreeNode(18);
		
		a.left=b;
		a.right=c;
		b.left=d;
		b.right=e;
		d.left=h;
		e.right=i;
		i.left=l;
		i.right=m;
		c.left=f;
		c.right=g;
		f.right=j;
		g.right=k;
		k.left=n;
		return a;
	} 
	
	public static TreeNode DeleteNodefromBST(TreeNode r,int data) {
		 if(r==null)return null;
		 else if(r.val>data)
			 r.left=DeleteNodefromBST(r.left, data);
		 else if(r.val<data)
			 r.right=DeleteNodefromBST(r.right, data);
		 else//r.val==data
		 {
			 //case 1 no child
			 if(r.left==null&&r.right==null) {
				 r=null;
				 System.out.println("child deleted"); 
			 }
			 //case 2 one child
			 if(r.left==null&&r.right!=null) {
				 r=r.right;
			 }
			 if(r.right==null&&r.left!=null) {
				 r=r.left;
			 }
			 //case 3 both children are alive
			 if(r.right!=null&&r.left!=null) {
				 TreeNode temp=FindMinimumBST(r.right);
				 r.val=temp.val;
				 r.right=DeleteNodefromBST(r.right,temp.val);
			 }
		 }
		 return r;
	}
	
	private static TreeNode FindMin(TreeNode r, int min) {
		if(r!=null)
		{
			TreeNode left=FindMin(r.left,min);
			TreeNode right=FindMin(r.right,min);
			if(left!=null&&right!=null) {
			if(left.val<right.val)
				return left;
			else if(left.val>right.val)
				return right;
			}
			else if(left==null)
				return right;
			else
				return left;

		}
		return null;
	}

	public static void printTreeBFS(TreeNode r) {
		
		Queue<TreeNode> q= new LinkedList<TreeNode>();
		q.offer(r);
		while(!q.isEmpty()) {
			TreeNode tmp=q.poll();
			if(tmp!=null) {
				System.out.print(tmp.val+",");
				q.offer(tmp.left);
				q.offer(tmp.right);
			}
		}
	}
	
	public static void main(String[] args) {
		TreeNode root= new TreeNode();
		DeleteNodeBST d= new DeleteNodeBST();
		root=d.constructBST();
 		d.printTreeBFS(root);
 		d.DeleteNodefromBST(root,15);
 		System.out.println("After deletion of 15");
 		d.printTreeBFS(root);
	//	TreeNode min=FindMinimumBST(root);
	//	System.out.println(min.val);
	}

	private static TreeNode FindMinimumBST(TreeNode root) {
		if(root!=null) {  
		TreeNode left=FindMinimumBST(root.left);
		if(left!=null)
		return left;
		}
		return root;
	}
}
