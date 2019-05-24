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
		System.out.println("==========================================");
		
		int selection = input.nextInt();
		
		switch (selection) {
		case 1:
			System.out.println("\nEnter Visa Card number:  ");
			long number = input.nextLong();
			break;
		case 2: 
			System.out.println("\nEnter Master Card number:  ");
			long number1 = input.nextLong();
			break;
		case 3: 
			System.out.println("\nEnter American Express Card number:  ");
			long number2 = input.nextLong();
			break;
		case 4: 
			System.out.println("\nEnter Discover Card number:  ");
			long number3 = input.nextLong();
		case 0: 
			System.out.println("Thank you for using our application. Have a nice day.");
			break;
		default:
			System.out.println("\nError. Your selection entry was incorrect. Try again.");
			break;
		}
		

	}

}
