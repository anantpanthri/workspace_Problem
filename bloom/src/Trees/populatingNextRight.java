package Trees;
public class populatingNextRight {

	 public static void inorderTraversal(TreeNode root,TreeNode prev) {
		  
         TreeNode dummyHead = new TreeNode(0);
         TreeNode pre = dummyHead;
         while (root != null) {
        	 if (root.left != null) {
		    pre.next = root.left;
		    pre = pre.next;
        	 }
        	 if (root.right != null) {
		    pre.next = root.right;
		    pre = pre.next;
        	 }
	    root = root.next;
	    	if (root == null) {
		    pre = dummyHead;
		    root = dummyHead.next;
		    dummyHead.next = null;
	    	}
         } 
		 
	 }   
	 
		public static void main(String[] args) {
			TreeNode a= new TreeNode(0);
			TreeNode b= new TreeNode(1);
			TreeNode c= new TreeNode(2);
			TreeNode d= new TreeNode(3);
			TreeNode e= new TreeNode(4);
			TreeNode f= new TreeNode(5);
			TreeNode g= new TreeNode(6);
			a.left=b;			a.right=c;			b.left=d;			b.right=e;			c.left=f;			c.right=g;
			


			  inorderTraversal(a,a);
			  printinorderTraversal(a);

		}
		
		private static void printinorderTraversal(TreeNode a) {
			if(a==null)
		return;
			printinorderTraversal(a.left);
			System.out.println(a.val);
			printinorderTraversal(a.right);
		
		}

	}
