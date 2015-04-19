package onlinetest2;

import java.util.LinkedList;

/**
 * 
 * @author Xiaodong
 * 
 */
public class TreeNode {
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public TreeNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setLeftChild(TreeNode child) {
		leftChild = child;
	}

	public void setRightChild(TreeNode child) {
		rightChild = child;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public int depth() {
		int dep = 1;
		if (leftChild != null)
			if (leftChild.depth() + 1 > dep)
				dep = leftChild.depth() + 1;
		if (rightChild != null)
			if (rightChild.depth() + 1 > dep)
				dep = rightChild.depth() + 1;
		return dep;
	}

	public String toString() {
		String ret = "";
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(this);
		TreeNode n;
		while (!queue.isEmpty()) {
			n = queue.poll();
			ret += n.data + " ";
			if (n.leftChild != null)
				queue.offer(n.leftChild);
			if (n.rightChild != null)
				queue.offer(n.rightChild);
		}
		return ret.trim();
	}

}
