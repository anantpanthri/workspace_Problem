package Nile;

import java.util.*;

/*2.
 * Dynamic programming and design questions -TusharRoy
 */

/*
 * 4.Questions on multi process synchronization and concurrency.
	Model the traffic light at the road intersection.
 */
/*
 * 1. A manager has several employees reporting to her, whom 
 * themselves have reporters. Print out the reporting structure.
	2. Given a plot that has peaks and troughs, find the maximum volume 
	of rain water that can be trapped in one trough.
 */
/*
 *  Object-oriented concept questions and a coding problem
 */
/*some basic problem about recursion  
 * coding problems such as reverse a linked list and fizzBuzz
 * Tell if a tree is a BST or not
 * 
 */
/*
 * reverse a linked list, 
 * what is hash table, 
 * OODesign a black-jack
 */
public class PaintBucket {
	
	public static void main(String[] args) {
		outline();
		rotateMatrix();
		imageReversal();
		slidingWindow();//O(n) Solution time complexity
		mergeKLists();
		phoneLetterComboBFS();
		ladderLength();
		boundaryBinaryTree();
		System.out.println(calpoints());
		
		}
	private  static int calpoints() {

		String ops[]={"5","-2","4","C","D","9","+","+"};
		LinkedList<Integer> ls= new LinkedList<>();
		int sum=0;
		for(String c:ops) {
			if(c.equals("C")) {
				sum-=ls.removeLast();
			}
			else if(c.equalsIgnoreCase("D")) {
				ls.add(ls.peekLast()*2);
				sum+=ls.peekLast();
			}
			else if(c.equalsIgnoreCase("+")) {
				ls.add(ls.peekLast()+ls.get(ls.size()-2));
				sum+=ls.peekLast();
			}
			else {
				ls.add(Integer.parseInt(c));
				sum+=Integer.parseInt(c);
		}
		}
		return sum;
		
		
		
		
	}




	static List<Integer> nodes = new ArrayList<>();
	
	private static void boundaryBinaryTree() {
		TreeNode root= (new TreeNode()).populateTreeBoundaryStyle();
		if(root == null) return ;

	    nodes.add(root.val);
	    leftBoundary(root.left);
	    leaves(root.left);
	    leaves(root.right);
	    rightBoundary(root.right);
	    
	    for(int i:nodes) {
	    	System.out.print(i+".");
	    }
	}
	public static void leftBoundary(TreeNode root) {
	    if(root == null || (root.left == null && root.right == null)) return;
	    nodes.add(root.val);
	    if(root.left == null) leftBoundary(root.right);
	    else leftBoundary(root.left);
	}
	public static void rightBoundary(TreeNode root) {
	    if(root == null || (root.right == null && root.left == null)) return;
	    if(root.right == null)rightBoundary(root.left);
	    else rightBoundary(root.right);
	    nodes.add(root.val); // add after child visit(reverse)
	}
	public static void leaves(TreeNode root) {
	    if(root == null) return;
	    if(root.left == null && root.right == null) {
	        nodes.add(root.val);
	        return;
	    }
	    leaves(root.left);
	    leaves(root.right);
	}
	
	
	
	
	
	private static void ladderLength() {

		String beginWord="hit";
		String endWord="cog";
		Set<String> wordList= new HashSet<>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		wordList.add("cog");
		System.out.println(ladderLength(beginWord,endWord,wordList));
		
	}

	    public static int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
	        LinkedList<WordNode> queue = new LinkedList<WordNode>();
	        queue.add(new WordNode(beginWord, 1));
	 
	        wordDict.add(endWord);
	 
	        while(!queue.isEmpty()){
	            WordNode top = queue.poll();
	            String word = top.word; 
	 
	            if(word.equals(endWord)){
	                return top.numSteps;
	            }
	 
	            char[] arr = word.toCharArray();
	            for(int i=0; i<arr.length; i++){
	                for(char c='a'; c<='z'; c++){
	                    char temp = arr[i];
	                    if(arr[i]!=c){
	                        arr[i]=c;
	                    }
	 
	                    String newWord = new String(arr);
	                    System.out.print(newWord+",");
	                    if(wordDict.contains(newWord)){
	                        queue.add(new WordNode(newWord, top.numSteps+1));
	                        wordDict.remove(newWord);
	                    }
	 
	                    arr[i]=temp;
	                }
	                System.out.println();
	            }
	        }
	 List<String> ls= new ArrayList<>();
	        return 0;
	    }


	private static void phoneLetterComboBFS() {
		List<String>s=phoneLetterCombo("22");
		for(String s1:s){
			System.out.print(s1+",");
		}
		
	}

	private static List<String> phoneLetterCombo(String digits) {

		LinkedList<String> ans = new LinkedList<String>();
		if(digits.isEmpty()) return ans;
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
		while(ans.peek().length()!=digits.length()){
			String remove = ans.remove();
			String map = mapping[digits.charAt(remove.length())-'0'];
			for(char c: map.toCharArray()){
				ans.addLast(remove+c);
			}
		}
		return ans;
	}

	private static void mergeKLists() {
		// TODO Auto-generated method stub
		Node a= new Node(1);
		Node b= new Node(4);
		Node c= new Node(5);
		a.next=b;
		b.next=c;
		c.next=null;
		Node d= new Node(1);
		Node e= new Node(3);
		Node f= new Node(4);
		d.next=e;
		e.next=f;
		f.next=null;
		Node g= new Node(2);
		Node h= new Node(6);
		g.next=h;
		h.next=null;
		List <Node> list= new ArrayList<>();
		list.add(a);
		list.add(d);
		list.add(g);
		Node ans=mergeKLists(list);
		while(ans!=null) {
			System.out.println(ans.val);
			ans=ans.next;
		}
	}

	private static Node mergeKLists(List<Node>l) {
		 if(l==null||l.size()<1)
		 	 return null;
		 PriorityQueue<Node> pq= new PriorityQueue<Node>(l.size(), new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if(o1.val>o2.val)
				return 1;
				else if(o1.val==o2.val)
					return 0;
				else
					return -1;
			}
		 });
		 PriorityQueue<Node> pq2= new PriorityQueue<Node>(l.size(),(o1,o2)->o1.val-o2.val);
		
		 for(Node n:l)  
			 if(n!=null)
				 pq.add(n);
		 Node dummy = new Node(0);
	        Node tail=dummy;
		 while(!pq.isEmpty()) {
			 tail.next=pq.poll();
	            tail=tail.next;
	            //this is 20%
	            if (tail.next!=null)
	                pq.add(tail.next);
		 }
		 
		 
		 return dummy.next;
	}
	
	private static void slidingWindow() {
		int arr[]= {1,3,-1,-3,5,3,6,7};
		arr=maxSlidingWindow(arr,3);;
		for(int i:arr) {
			System.out.print(i+",");
		}
	}
	
	public static int[] maxSlidingWindow(int[] a, int k) {		
		if (a == null || k <= 0) {
			return new int[0];
		}
		int n = a.length;
		int[] r = new int[n-k+1];
		int ri = 0;
		// store index
		Deque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < a.length; i++) {
			// remove numbers out of range k
			while (!q.isEmpty() && q.peek() < i - k + 1) {
				q.poll();
			}
			// remove smaller numbers in k range as they are useless
			while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
				q.pollLast();
			}
			// q contains index... r contains content
			q.offer(i);
			if (i >= k - 1) {
				r[ri++] = a[q.peek()];
			}
		}
		return r;
	}
	
	
	public static void rotateMatrix() {
		int arr[][]= {
					{1,2,3},
					{4,5,6},
					{7,8,9}
		};
		boolean visited[][]= new boolean[arr.length][arr[0].length];
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<(arr[0].length);++j) {
				if(visited[i][j]||visited[i][j]) {
					continue;
				}
				visited[i][j]=true;
				visited[j][i]=true;
				int temp=arr[i][j];
				 arr[i][j]=arr[j][i];
				 arr[j][i]=temp;
			}
		}
		for(int i=0;i<(arr.length)/2;++i) {
			for(int j=0;j<arr[0].length;++j) {
				 int temp=arr[i][j];
				 arr[i][j]=arr[arr.length-1][j];
				 arr[arr.length-1][j]=temp;
			}
		}
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<arr[0].length;++j) {
			System.out.print(arr[i][j]);
			}
			System.out.println();
			}
	}
	
	
	
	/*1
	 * Given a 2D array of black, white pixels, 
	 * write a program that turns all of the black sections 
	 * into outlines of themselves. Coded an interactive solution, 
	 * and then was asked to do it recursively, the code was similar and easy to implement  
	 */
	private static void outline() {
		int arr[][]= {
				{1,1,1,1,1,0,0,0},
				{1,1,1,1,1,0,0,0},
				{1,1,1,1,1,0,0,0},
				{1,1,1,1,1,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
		};
		int out[][]= {
				{1,1,1,1,0,0,0,0},
				{1,0,0,1,0,0,0,0},
				{1,1,1,1,0,0,0,0},
				{0,0,0,0,0,1,1,1},
				{0,0,0,0,0,1,0,1},
				{0,0,0,0,0,1,1,1}	
		};
		int rowBound []= new int[2];
		int colBound []=new int[2];
		int islands=0;
		int brr[][]=arr;
		int boundaries[]=calculateLimits(arr);
		
		for(int i=boundaries[0]+1;i<boundaries[1];++i) {
			for(int j=boundaries[2]+1;j<boundaries[3];++j) {	
				if(arr[i][j]==1) {
					arr[i][j]=0;
				}
			}
		}
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<arr[0].length;++j) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
	}
	
	
	private static int[] calculateLimits(int[][] arr) {
		int  minRowBound=Integer.MAX_VALUE;
		int  maxRowBound=Integer.MIN_VALUE;
		int  minColBound=Integer.MAX_VALUE;
		int  maxColBound=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<arr[0].length;++j) {
				 if(arr[i][0]==1) {
					 if(minRowBound>i)
						 minRowBound=i;
					 if(maxRowBound<i)
						 maxRowBound=i;
				 }
				 if(arr[0][j]==1) {
					 if(minColBound>j)
						 minColBound=j;
					 if(maxColBound<j)
						 maxColBound=j;
				 }
			 }
		}
		return new int[] {minRowBound,maxRowBound,minColBound,maxColBound};
		 }
		
	

	private static void doDfs(int[][] arr, int i, int j) {
		if(arr==null) return;
		if(i<0||j<0||i>=arr.length||j>=arr[0].length||arr[i][j]==0) {
			return;
		}
		arr[i][j]=0;
		doDfs(arr,i-1,j); 
		doDfs(arr,i+1,j);
		doDfs(arr,i,j-1);
		doDfs(arr,i,j+1);
	}

	/*3.
	 * Design the paint bucket tool consist of outline,image reversal problem
	 */
	private static void imageReversal() {
		// TODO Auto-generated method stub
		//i think rotate a matrix should do
	}
		
	}

