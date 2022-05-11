package Com.ExceptionHandling;

import java.util.Scanner;

public class CustomExceptionMain {
	
	public void demom() {
		int lm=4;
		if (lm==4){
			System.out.println("This is simple if");
		}else {
			System.out.println("This is simple else");
		}
	}

	int pin = 1234;
	int balance = 100000;
	int CurrentBalance;

	public void withdra(int pin) {
		int timecount = 1;
		int errorcount = 1;
		Scanner sc = new Scanner(System.in);

		while (timecount <= 3) {
			if (this.pin == pin) {
				this.balance();
			} else {
				System.out.println("Invalid pin. Please try again");
				pin = sc.nextInt();
				errorcount++;
			}
			timecount++;
		}
		

		if (errorcount > 3) {
			throw new CustomException();
		}
	}

	public void balance() {
		Scanner sc = new Scanner(System.in);

		for (int j = 0; j <= 4; j++) {
			System.out.println("1. Balance Enquiry");
			System.out.println("2. Withdraw Amount");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("Your current balance is " + this.balance + "\n");
				break;
			case 2:
				System.out.println("Enter amount to withdraw");
				int witham = sc.nextInt();
				if (witham <= this.balance) {
					this.balance -= witham;

					System.out.println("Your current balance is " + this.balance + "\n");
				} else {
					System.err.println("Insufficient Balance Please try Again.\n");
				}

			}
		}
	}

	public static void main(String[] args) {
		
		CustomExceptionMain cm = new CustomExceptionMain();
		cm.demom();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your pin number");
		cm.withdra(sc.nextInt());

	}

}
