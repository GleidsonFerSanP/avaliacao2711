package com.s2it;

import com.s2it.binarytree.BinaryTree;
import com.s2it.binarytree.BinaryTreeUtils;
import com.s2it.extras.LengthNumberException;
import com.s2it.extras.NullOrEmptyException;
import com.s2it.math.NumberCreator;

public class Main {
 
	public static void main(String[] args) {
	    
		
		//Execução do exercício 8
		try {
			System.out.println(NumberCreator.generateNumberFromTowOthersNumbers(12, 23));
		} catch (NullOrEmptyException e) {
			System.out.println(e.getMessage());
		} catch (LengthNumberException e) {
			System.out.println(e.getMessage());
		}
		
		// Execução do exercício 9
		
		BinaryTree raiz = new BinaryTree(20);
        System.out.println("Criando arvore com a raiz " + raiz.getValue());
       
        BinaryTreeUtils.insert(raiz, 22);
        BinaryTreeUtils.insert(raiz, 6);
        BinaryTreeUtils.insert(raiz, 15);
        BinaryTreeUtils.insert(raiz, 8);
        BinaryTreeUtils.insert(raiz, 17);
		
	}

}
