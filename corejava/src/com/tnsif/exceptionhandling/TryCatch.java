package com.tnsif.exceptionhandling;

public class TryCatch {
	
	public static void divide() {
		int a=6, b=0, c;
		try {
			
			try {
				c = a/b;
			}
			catch(ArrayIndexOutOfBoundsException s){
				System.out.println("Exception caught "+s.getMessage());
				
			}
			c=a/b;
		}
		catch (ArithmeticException e){
			System.out.println("Exception caught "+e.getMessage());
		}
		catch (Exception e){
			System.out.println("Exception caught "+e.getMessage());
			System.exit(0);//use this to skip finally from executing
			
		}
		finally {
			System.out.println("finally executes no matter wat");
		}
		
		
	}
}