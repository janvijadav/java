//for statement..[14]

import java.util.*;
class for2
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	    System.out.println("Enter no...");
		for(i=1; i<=10; i++)
		{
			System.out.println(i+" ");
		}
		System.out.println(" ");
		for(i=1; i<=n; i++)
		{
			System.out.println(i+" ");
		}
		System.out.println(" ");
		for(i=1; i<=n; i++);
		{
			System.out.println(i+" ");
		}
		System.out.println(" ");
	}
}
