//using thread class
package com.tnsif.threads;

public class FirstWay extends Thread{
	public void run() { //running state
		System.out.print("Creation of thread by extending thread class");
	}
	
	public static void main(String []args) {
		FirstWay ob = new FirstWay();
		
		ob.start();
		ob.stop();
	}

}
