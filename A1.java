/*A java program that reads three integer numbers input by the user, calculates their sum and product, and prints these values to the screen.*/

import java.util.Scanner;

class A1
{
	public static void main(String args[])
	{
		int num1,num2,num3,sum,prod;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers :-");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();

		sum=num1+num2+num3;
		prod=num1*num2*num3;
		System.out.println("Sum of 3 numbers = "+sum);
		System.out.println("Product of 3 numbers = "+prod);
	}
}

