class SubTree {
	public boolean checkSubTree(TreeNode rootA, TreeNode rootB) {
		if(rootB == null) return true;
		return checkForRoot(rootA,rootB);
	}


	private boolean checkForRoot(TreeNode rootA, TreeNode rootB) {
		// TODO Auto-generated method stub
		if(rootA == null) return false;
		else if(rootA.data == rootB.data && matchTree(rootA,rootB)) return true;
		return checkForRoot(rootA.left, rootB) || checkForRoot(rootA.right, rootB);
	}


	private boolean matchTree(TreeNode rootA, TreeNode rootB) {
		// TODO Auto-generated method stub
		if(rootA == null && rootB == null) {
			return true;
		}
		else if(rootA == null || rootB == null) {
			return false;
		}
		else if (rootA.data != rootB.data) return false;
		else {
			return matchTree(rootA.left, rootB.left) && matchTree(rootA.right, rootB.right);
		}
	}
}