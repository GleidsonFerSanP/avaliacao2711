package com.s2it.binarytree;


import com.s2it.extras.NullOrEmptyException;

public class BinaryTreeUtils {

	private static BinaryTree nodeSearched = null;
	private static Integer totalValue = 0;

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

	public static void nextPrefixedNode(BinaryTree node) {
		if(node != null){
			System.out.print(node.getValue() + " ");
			nextPrefixedNode(node.getLeft());
			nextPrefixedNode(node.getRight());
		}
	}

	private static BinaryTree searchNode(BinaryTree rootNode, BinaryTree node) throws NullOrEmptyException {

		validate(rootNode, node);
		getNode(rootNode, node);
		return nodeSearched;
	}

	private static void validate(BinaryTree rootNode, BinaryTree node) throws NullOrEmptyException {
		if(rootNode == null)
			throw new NullOrEmptyException("Informe o nó raiz!");

		if(node == null)
			throw new NullOrEmptyException("Informe o nó que deseja buscar!");
	}

	private static void getNode(BinaryTree rootNode, BinaryTree node) {

		if(nodeSearched != null )
			return;

		if(rootNode == null ) {
			nodeSearched =  null;
			return;
		}

		if(rootNode.getValue() == node.getValue()) {
			nodeSearched = rootNode;
			return;
		}else {
			if(rootNode.getRight() != null && (rootNode.getRight().getValue()  == node.getValue())) {
				nodeSearched = rootNode.getRight();
				return;
			}
			else if(rootNode.getLeft() != null && (rootNode.getLeft().getValue() == node.getValue())) {
				nodeSearched = rootNode.getLeft();
				return;
			}
			else {
				if(nodeSearched == null) {
					getNode(rootNode.getRight(), node);
					getNode(rootNode.getLeft(), node);
				}
			}
		}

	}

	public static Integer sumSubsequentsNodes(BinaryTree rootNode, BinaryTree node) throws NullOrEmptyException {

		BinaryTree nodeSeached = BinaryTreeUtils.searchNode(rootNode, node);

		if(nodeSeached == null)
			throw new NullOrEmptyException("O nó solicitado não existe");

		sumValueChildNodes(nodeSeached);

		Integer sumValue = new Integer(totalValue - nodeSeached.getValue());

		return sumValue;
	}

	private static void sumValueChildNodes(BinaryTree node) {

		if(node.getRight() != null) {
			totalValue = totalValue + node.getRight().getValue();
			sumValueChildNodes(node.getRight());
		}else {
			totalValue = totalValue + 0;
		}

		if(node.getLeft() != null) {
			totalValue = totalValue + node.getLeft().getValue();
			sumValueChildNodes(node.getLeft());
		}else {
			totalValue = totalValue + 0;
		}
	}

}
