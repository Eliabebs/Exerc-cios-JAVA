package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("ENTER ACCOUNT NUMBER: ");
		int number = sc.nextInt();
		System.out.print("ENTER ACCOUNT HOLDER: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("IS THERE AN INITIAL DEPOSIT (Y/N)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("ENTER INITIAL DEPOSIT VALUE: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("ENTER A DEPOSIT VALUE: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("UPDATED ACCOUNT DATA: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("ENTER A WITHDRAW VALUE: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("UPDATED ACCOUNT DATA: ");
		System.out.println(account);
		
		
		sc.close();

	}

}
