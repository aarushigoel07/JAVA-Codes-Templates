/*A program to read 3 integer numbers that are input by user and print the same onto screen.*/

import java.util.Scanner;

class A1
{
	public static void main(String args[])
	{
		int num1,num2,num3;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers :-");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();

		System.out.println("num 1 = "+num1);
		System.out.println("num 2 = "+num2);
		System.out.println("num 3 = "+num3);
	}
}

