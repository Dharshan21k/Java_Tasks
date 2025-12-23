package Exceptions;

public class ArgumentsExceptions {
	static void validateAge(int age){

        if (age < 18) {
            // Explicitly throwing the exception
            throw new IllegalArgumentException("Age must be 18 or above");
        }

        System.out.println("Age is valid");
    }
	public static void main(String args[]) {
	
        try {
            validateAge(18);   // calling method
        } catch (IllegalArgumentException e) {
            // Handling the exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
	}

