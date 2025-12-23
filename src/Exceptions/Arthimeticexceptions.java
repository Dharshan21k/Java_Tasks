package Exceptions;

public class Arthimeticexceptions {
	public static void divide(int a,int b) {
		if(b==0) {
			throw new ArithmeticException("divider can not be zero");
		}
		int c=a/b;
	}
	public static void main(String args[]) {
		
	
	int a=10,b=0;
	try {
		divide(a,b);
		
	}catch(ArithmeticException e ) {
		System.out.println(e.getMessage());
	}
	}

}
