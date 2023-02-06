package Banker;

import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);
	public static double total;


	public static void main(String[] args) { 
		Account acc = new Account();
		SavingAcc svac = new SavingAcc();
		System.out.println("Welcome TO AB Bank");
		System.out.println("please Login ");
		System.out.println("User:");
		String user = scn.next();
		System.out.println( user + "s Password:");
		String password = scn.next();
		System.out.println("Welcome" + user);
		System.out.println("Select an option");
		boolean menuLoop = true;
		while (menuLoop) {
			System.out.println("[1] Withdraw");
			System.out.println("[2] Check Balance");
			System.out.println("[3] Deposit");
			System.out.println("[4] Saving Account");
			System.out.println("[5] Log out");

			String input = scn.next();
			switch (input) {
			case "1":
				System.out.println("Enter Amount: ");
				double amount1 = Main.scn.nextDouble();
				
				acc.withdraw(acc.getBalance());
				  total = (acc.getBalance() - amount1);
	                System.out.println("You Successfully Withdrew " + amount1 + " Your Balance is " + total);
				break;
			case "2":
				System.out.println("Your Balance is :"+	total);

				break;
			case "3":
				acc.diposit(acc.getBalance());

				break;
				
			case "4":
				svac.Calculate();
				break;
				
			case "5":
				System.exit(0);
				break;

			default:
				System.out.println("Invalid option. Please choose again.");
				break;
			}
		}
	}
}
