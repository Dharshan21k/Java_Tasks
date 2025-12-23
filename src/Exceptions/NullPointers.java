package Exceptions;

public class NullPointers {
	public static void main(String args[]) {
		String name=null;
		try {
			if(name.length()>4) {
				System.out.println("the name conatins length greater than 4");
			}
			else {
				System.out.println("the name conatins length less than 4");
				
			}
		}catch(NullPointerException e) {
			System.out.println("Null in name String");
			
		}
	}

}
