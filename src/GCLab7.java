import java.util.Scanner;

public class GCLab7 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String s1 = Name(scnr, "Please enter a valid Name: ");
		
		
		String s2 = Email(scnr, "Please enter a valid email: ");
		
		
		String s3 = phoneNumber(scnr, "Please enter a valid phone number: ");
		
		
		String s4 = Date(scnr, "Please enter a valid date: ");
		

	}

	public static String Name(Scanner scnr, String input) {
		
		do {
			System.out.println("Please, enter a valid name: ");
			input = scnr.nextLine();
			
			boolean valid = input.matches("[A-Z]+[a-z]{1,30}");
			
			System.out.println(valid ? "Valid" : "Not Valid");
			
		} while (!input.matches("[A-Z]+[a-z]{1,30}"));
		
		return input;

	}

	public static String Email(Scanner scnr, String input) {
		
		do {
			System.out.println("Please, enter a valid email: ");
			input = scnr.nextLine();
			
			boolean valid = input.matches("[A-z0-9]{5,30}[@][A-z0-9]{5,10}[.][A-z0-9]{2,3}");
			
			System.out.println(valid ? "Valid" : "Not Valid");
			
		} while (!input.matches("[A-z0-9]{5,30}[@][A-z0-9]{5,10}[.][A-z0-9]{2,3}"));
		return input;
	}

	public static String phoneNumber(Scanner scnr, String input) {
		
		do {
			System.out.println("Please, enter a valid phone number: ");
			input = scnr.nextLine();
			
			boolean valid = input.matches("[0-9]{3}[-][0-9]{3}[-][0-9]{4}");
			
			System.out.println(valid ? "Valid" : "Not Valid");
			
		} while (!input.matches("[0-9]{3}[-][0-9]{3}[-][0-9]{4}"));
		return input;
	}

	public static String Date(Scanner scnr, String input) {
		
		do {
			System.out.println("Please, enter a valid date: ");
			input = scnr.nextLine();
			
			boolean valid = input.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
			
			System.out.println(valid ? "Valid" : "Not Valid");
			
		} while (!input.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}"));
		return input;
	}
}