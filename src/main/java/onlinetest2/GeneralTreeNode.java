package onlinetest2;

import java.util.LinkedList;

/**
 * 
 * @author Xiaodong
 * 
 * @param <T>
 */
public class GeneralTreeNode<T> {
	private T data;
	private GeneralTreeNode<T> leftChild;
	private GeneralTreeNode<T> rightChild;

	public GeneralTreeNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setLeftChild(GeneralTreeNode<T> child) {
		leftChild = child;
	}

	public void setRightChild(GeneralTreeNode<T> child) {
		rightChild = child;
	}

	public GeneralTreeNode<T> getLeftChild() {
		return leftChild;
	}

	public GeneralTreeNode<T> getRightChild() {
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
		LinkedList<GeneralTreeNode<T>> queue = new LinkedList<GeneralTreeNode<T>>();
		queue.offer(this);
		GeneralTreeNode<T> n;
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

	public boolean search(T key) {
		if (data.equals(key))
			return true;

		if (leftChild != null)
			if (leftChild.search(key))
				return true;
		if (rightChild != null)
			if (rightChild.search(key))
				return true;

		return false;

	}

	public boolean isSymmetric() {
		return isMirror(this.getLeftChild(), this.getRightChild());
	}

	private boolean isMirror(GeneralTreeNode<T> tree1, GeneralTreeNode<T> tree2) {
		if (tree1 == null && tree2 == null) {
			return true;
		} else if (tree1 == null || tree2 == null) {
			return false;
		}
		boolean b1 = tree1.getData().equals(tree2.getData());
		boolean b2 = isMirror(tree1.getLeftChild(), tree2.getRightChild());
		boolean b3 = isMirror(tree1.getRightChild(), tree2.getLeftChild());

		return b1 && b2 && b3;
	}
}
