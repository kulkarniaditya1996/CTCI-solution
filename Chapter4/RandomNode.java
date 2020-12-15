public class RandomNode {
	public Node randomNode() {
		int ran = new Random().nextInt(root.size);
		return getRandomNode(root, ran);
	}

	private Node getRandomNode(Node node , int ran) {
		// TODO Auto-generated method stub
		int leftside = node.left == null ? 0:root.left.size;
		if(leftside < ran) {
			return getRandomNode(node.left, ran);
		}
		else if(leftside == ran) {
			return node;
		}
		else {
			return getRandomNode(node.right, ran - (leftside+1));
		}
	}
}
