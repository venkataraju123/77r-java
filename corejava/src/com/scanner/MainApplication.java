package com.scanner;

import java.util.Scanner;

public class MainApplication {
		public static void main(String[] args) {
			int option;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name : ");
			String name=sc.next();
			System.out.println("Enter Address : ");
			String add=sc.next();
			System.out.println("Enter Phone Number : ");
			long pno=sc.nextLong();
			System.out.println("Enter your Initial Deposit Balance : ");
			double balance=sc.nextDouble();
			System.out.println("Account Created Successfully.");
			BankApp ma=new BankApp(name, add, pno, balance);
			do {
				System.out.println("Select Options from below : ");
				System.out.println("1. Withdraw");
				System.out.println("2. Deposit");
				System.out.println("3. Show Balance");
				System.out.println("4. Exit");
				System.out.println("Enter Option Here [1-4] : ");
				option=sc.nextInt();
				switch(option) {
				case 1: System.out.println("Enter Withdraw Amount : ");
						double wamount=sc.nextDouble();
						ma.withdraw(wamount);
						break;
				case 2: System.out.println("Enter Deposit Amount : ");
						double damount=sc.nextDouble();
						ma.deposit(damount);
						break;
				case 3: ma.showBalance();
						break;
				case 4: System.out.println("Thank You");
						break;
				}
				
			}while(option!=4);
			
sc.close();
		}

	}


