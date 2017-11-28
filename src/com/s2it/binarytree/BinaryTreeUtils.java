package com.s2it.binarytree;

public class BinaryTreeUtils {
	
	public static void insert(BinaryTree node, int value) {
		if (value < node.getValue()) {
			if (node.getLeft() != null) {
				insert(node.getLeft(), value);
			} else {
				System.out.println("Inserido nó " + value + " a esqueda de " + node.getValue());
				node.setLeft(new BinaryTree(value));
			}
		} else if (value > node.getValue()) {
			if (node.getRight() != null) {
				insert(node.getRight(), value);
			} else {
				System.out.println("Inserido nó " + value + " a right de " + node.getValue());
				node.setRight( new BinaryTree(value));
			}
		}
	}
	
	public static Integer sumSubsequentsNodes(BinaryTree rootNode, BinaryTree node) {
		return 0;
	}

}
