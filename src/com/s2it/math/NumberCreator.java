package com.s2it.math;

import com.s2it.extras.LengthNumberException;
import com.s2it.extras.NullOrEmptyException;

public class NumberCreator {

	public static Integer generateNumberFromTowOthersNumbers(Integer numberOne, Integer numberTwo) throws NullOrEmptyException, LengthNumberException {
		
		validate(numberOne, numberTwo);
		
		String stringNumberThree = getStringNumberGenerated(numberOne, numberTwo);
		
		Integer result = null;
		
		try {
			result = Integer.valueOf(stringNumberThree);
		} catch (Exception e) {
			result = -100;
		}
		
		return result > 1000000 ? -1 : result; 
	}

	private static String getStringNumberGenerated(Integer numberOne, Integer numberTwo) {
		
		String stringNumberOne = numberOne.toString();
		String stringNumberTwo = numberTwo.toString();
		
		String stringNumberGenereted = "";
		
        int limite = Math.max(stringNumberOne.length(), stringNumberTwo.length());
        
        for (int i = 0; i <= limite; i++) {
        	if (i < stringNumberOne.length()) {
        		stringNumberGenereted += stringNumberOne.charAt(i);
        	}
        	if (i < stringNumberTwo.length()) {
    	    	stringNumberGenereted += stringNumberTwo.charAt(i);
        	}
        }
		
		return stringNumberGenereted;
	}

	private static void validate(Integer numberOne, Integer numberTwo) throws NullOrEmptyException, LengthNumberException {
		
		if(numberOne == null)
			throw new NullOrEmptyException("Informe o primeiro número");

		if(numberTwo == null)
			throw new NullOrEmptyException("Informe o segundo número");
		
		String stringNumberOne = numberOne.toString();
		
		if(stringNumberOne.length() < 2)
			throw new LengthNumberException("Informe o primeiro número com ao menos 2 dígitos");
		
		String stringNumberTwo = numberTwo.toString();
		
		if(stringNumberTwo.length() < 2)
			throw new LengthNumberException("Informe o segundo número com ao menos 2 dígitos");
		
	}
	
}
