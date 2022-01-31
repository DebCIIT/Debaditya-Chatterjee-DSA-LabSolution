package com.greatlearning.driver;

import com.greatlearning.service.BalanceBrackets;

public class BalanceBracketsDriver {
		
		public static void main(String[] args) {
			
			
		        String expr = "([[{}]])";
		        if(expr.length()==0)
		        	System.out.println("String is Empty");
		        else {
	 
	        
	        if (BalanceBrackets.areBracketsBalanced(expr))
	            System.out.println("The entered String has Balanced Brackets");
	        else
	            System.out.println("The entered Strings do not contain Balanced Brackets");
		        }
	    }

}
