package revision;
import java.util.*;
public class levelOrder_Queue {

	public static void main(String[] args) {

		TreeNode t= new TreeNode();
		t=t.populateTree();
		t.LevelOrderTraversal(t);
		System.out.println("\n My appraoch");
		Queue<TreeNode>q= new LinkedList<TreeNode>();
		TreeNode b= new TreeNode();
		b=b.populateTree();
		q.offer(b);
		while(!q.isEmpty()) {
			TreeNode tmp=q.poll();
			if(tmp!=null) {
				System.out.print(tmp.val+",");
				q.offer(tmp.left);
				q.offer(tmp.right);
			}
		}
		TreeNode c= new TreeNode();
		c=c.populateTree();
		Stack <TreeNode>st= new Stack();
		TreeNode temp=c;
		System.out.println("\n Stack Approach");
		while(temp!=null) {
			System.out.print(temp.val+",");
			st.push(temp);
			temp=temp.left;
		}
		while(!st.isEmpty()) {
			TreeNode tmp= st.pop();
			TreeNode r= tmp.right;
			while(r!=null) {
				System.out.print(r.val+",");
				st.push(r);
				r=r.left;
			}
		}
		
	}

}
