package random;

class WithoutException {
	public static void main(String args[]) {
		
		int d = 0;
		
		try {
			System.out.println("wade");
			int a = 42 / d; //exception is raised
			
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled succesfully" + e.getMessage());
		}
	}
}
