package com.s2it;

import com.s2it.extras.LengthNumberException;
import com.s2it.extras.NullOrEmptyException;
import com.s2it.math.NumberCreator;

public class Main {
 
	public static void main(String[] args) {
	    
		try {
			System.out.println(NumberCreator.generateNumberFromTowOthersNumbers(12, 23));
		} catch (NullOrEmptyException e) {
			System.out.println(e.getMessage());
		} catch (LengthNumberException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
