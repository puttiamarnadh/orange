package programs;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		
		int reverse=0;
		int remainder;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter numer");
		int number=scan.nextInt();
		while(number!=0) {
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			System.out.println("palindrome of given number is  "+reverse);
		}
		
	}

}
