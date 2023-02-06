package Banker;

import java.util.Scanner;

public class SavingAcc extends Account {
	Scanner scn = new Scanner(System.in);
	public void Calculate() {
		
		System.out.println("Enter time");
		int time = scn.nextInt();
		double rate = 0.43;
		double interest = Main.total * rate * time;
		System.out.println("Interest Earned :" + interest + "OMR");
		
		
	
		
		
	}
	}
	

