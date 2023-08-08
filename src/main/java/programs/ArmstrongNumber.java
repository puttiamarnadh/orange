package programs;

import java.util.Scanner;

public class ArmstrongNumber {
	static int remainder;
	static int sum=0,num;
	static int temp=num;
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		while(num!=0) {
			try {
				remainder=num%10;
				sum=sum+remainder*remainder*remainder;
				num=num /10;
				System.out.println(sum);
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(sum==num) 
			System.out.println("given number is armstrong number");
		else 
			System.out.println("given number is not armstrong number");
		
		
	}

}
