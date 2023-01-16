//simple if...[6 program]

import java.util.*;
class simpleif
{
	public static void main(String args[])
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age ");
		age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible for vote......");
		}
		System.out.println("End");
	}
}