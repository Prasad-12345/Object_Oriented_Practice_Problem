package com.bridgelabz.objectorientedprograms;

import java.util.Scanner;
/*
 * Author: Prasad
 * Modify class accout to provide method called debit that withdraws money
 * from an account
 */
public class Account {
	//static variable
	public static double accountBalance;
	
	/*
	 * This method withdraw money fron account and calculate remaining balance
	 */
	public double debit() {
		double debitAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter debit amount");
		debitAmount = sc.nextDouble();
		if(accountBalance > debitAmount) {
			accountBalance = accountBalance - debitAmount;
			System.out.println("Accout Balance :" + accountBalance );
			return accountBalance;
		}
		else {
			accountBalance = accountBalance;
			System.out.println("Debit amount exceeded account balance");
			return accountBalance;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("Enter account balance:");
		Scanner sc = new Scanner(System.in);
		accountBalance = sc.nextDouble();
		//object
		Account account = new Account();
		account.debit();
	}
}
