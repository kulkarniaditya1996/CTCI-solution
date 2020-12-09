//Owner: Aditya Kulkarni
//CreatedOn: 7/12/2020

public class BSTtreeSuccessor {
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
	
	public Node successor(Node node) {
		if(node.right != null) {
			Node result = findminimum(node.right);
			return result;
		}
		else {
			while(node != null && node != node.parent.left) {
				node = node.parent;
			}
			return node;
		}
	}
	
	private Node findminimum(Node node) {
		// TODO Auto-generated method stub
		while(node.left != null) {
			node = node.left;
		}
		return node;
	}
}