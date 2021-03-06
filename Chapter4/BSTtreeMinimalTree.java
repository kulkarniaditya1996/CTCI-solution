//Owner: Aditya Kulkarni
//CreatedOn: 7/12/2020

public class BSTtreeMinimalTree {
	private Node root;
	
	class Node{
		private int data;
		private Node left;
		private Node right;
		private Node parent;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
			this.parent = null;
		}
	}
	
	public BSTtree() {
		this.root = null;
	}
	
	public void add(int data) {
		Node node = new Node(data);
		if(root == null) {
			root = node;
		}
		else {
			addwithroot(root,node);
		}
	}

	private void addwithroot(Node current, Node node) {
		// TODO Auto-generated method stub
		if(node.data < current.data) {
			if(current.left == null) {
				node.parent = current;
				current.left = node;
				return;
			}
			else {
				addwithroot(current.left, node);
			}
		}
		else {
			if(current.right == null) {
				node.parent = current;
				current.right = node;
				return;
			}
			else {
				addwithroot(current.right, node);
			}
		}
	}

	private void print() {
		// TODO Auto-generated method stub
		Node current = root;
		printwithRoot(current);
	}

	private void printwithRoot(Node current) {
		// TODO Auto-generated method stub
		if(current != null) {
			printwithRoot(current.left);
			System.out.println(current.data);
			printwithRoot(current.right);
		}
	}
	
	public void minimalTree(int[] arr) {
		root =  createMinimalTree(arr,0,arr.length-1);		
	}
	
	private Node createMinimalTree(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(end< start) {
			return null;
		}
		int mid = (start+end)/2;
		Node n = new Node(arr[mid]);
		n.left = createMinimalTree(arr,start,mid-1);
		n.right = createMinimalTree(arr,mid+1,end);
		
		return n;
	}
}