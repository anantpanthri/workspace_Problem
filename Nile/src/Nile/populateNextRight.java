package Nile;

import java.util.LinkedList;
import java.util.Queue;

public class populateNextRight {

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
	public static void main(String[] args) {
		TreeNode r= new TreeNode();
		r=constructBST();
		connect(r);
		printTreeBFS(r);


	}

	public static void printTreeBFS(TreeNode r) {

		Queue<TreeNode> q= new LinkedList<TreeNode>();
		q.offer(r);
		while(!q.isEmpty()) {
			TreeNode tmp=q.poll();
			if(tmp!=null) {
				System.out.println(tmp.next!=null?tmp.next.val:0+",");
				q.offer(tmp.left);
				q.offer(tmp.right);
			}
		}
	}
	public static void connect(TreeNode root) {
		TreeNode level_start=root;
		while(level_start!=null){
			TreeNode cur=level_start;
			while(cur!=null){
				if(cur.left!=null) cur.left.next=cur.right;
				if(cur.right!=null && cur.next!=null) cur.right.next=cur.next.left;

				cur=cur.next;
			}
			level_start=level_start.left;
		}
	}
}
