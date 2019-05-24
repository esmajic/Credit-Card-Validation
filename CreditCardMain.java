import java.util.Scanner;

public class CreditCardMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		System.out.println("\n========================================");
		System.out.println("      Credit Card Number Verification");
		System.out.println("========================================");
		System.out.println("\n==========================================");
		System.out.println("Enter 1 for Visa Card number");
		System.out.println("Enter 2 for Master Card number");
		System.out.println("Enter 3 for American Express Card number");
		System.out.println("Enter 4 for Discover Card number");
		System.out.println("Enter 0 for Exit");
		
		long number = input.nextLong();
		

	}

}
