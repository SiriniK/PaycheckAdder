package adding;

import java.util.Scanner;

public class AddingYourMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner	scanner = new Scanner(System.in);	
		System.out.println("First paycheck amount $:");
		int a = scanner.nextInt();
	
		
		System.out.println("2nd paycheck amount $:");
		int b = scanner.nextInt();
		
		System.out.println(a+b);
	}

}
