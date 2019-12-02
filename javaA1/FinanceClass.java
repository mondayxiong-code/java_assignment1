package asssignment;
import java.util.Scanner;

public class FinanceClass {
	
	static void home_loan(double salary, int age) {
		if(salary >= 30000) {
			if(age > 18) {
				System.out.println("You are eligible for a home loan.");
			}
			else {
				System.out.println("Sorry, you are not eligible for a home loan.");
			}
		}
		else {
			System.out.println("Sorry, you are not eligible for a home loan.");
		}
	}
	
	static void car_loan(double salary, int age) {
		if(salary >= 15000) {
			if(age > 18) {
				System.out.println("You are eligible for a car loan.");
			}
			else {
				System.out.println("Sorry, you are not eligible for a car loan.");
			}
		}
		else {
			System.out.println("Sorry, you are not eligible for a car loan.");
		}
	}
	
	static void personal_loan(double salary, int age) {
		if(salary >= 10000) {
			if(age > 18) {
				System.out.println("You are eligible for a personal loan.");
			}
			else {
				System.out.println("Sorry, you are not eligible for a personal loan.");
			}
		}
		else {
			System.out.println("Sorry, you are not eligible for a personal loan.");
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);	//taking in the user information 
		
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		System.out.println("Enter your address: ");
		String address = sc.next();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter your salary: ");
		double salary = sc.nextDouble();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Would you like to get a home loan? Enter yes or no.");
		String homeLoan = sc.next();
		boolean hloan;
		if(homeLoan.equals("yes") ) {
			hloan = true;
		}
		else {
			hloan = false;
		}
		
		System.out.println("Would you like to get a car loan? Enter yes or no.");
		String carLoan = sc.next();
		boolean cloan;
		if(carLoan.equals("yes") ) {
			cloan = true;
		}
		else {
			cloan = false;
		}
		System.out.println("Would you like to get a personal loan? Enter yes or no.");
		String personalLoan = sc.next();
		boolean ploan;
		if(personalLoan.equals("yes") ) {
			ploan = true;
		}
		else {
			ploan = false;
		}	
		
		System.out.println();
		System.out.println();
		
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("Home Loan: "+homeLoan);
		System.out.println("Car Loan: "+carLoan);
		System.out.println("Personal Loan: "+personalLoan);
		
		System.out.println();
		System.out.println();
		
		if(hloan == true) {
			home_loan(salary, age);
		}
		
		if(cloan == true) {
			home_loan(salary, age);
		}
		
		if(ploan == true) {
			home_loan(salary, age);
		}
		
	}

}
