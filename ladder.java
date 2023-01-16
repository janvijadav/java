//else-if ladder[10]

import java.util.*;
class ladder
{
	public static void main(String args[])
	{
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter average marks:-   ");
		avg=sc.nextFloat();
		if(avg>=69)
		{
			System.out.println("Distinction");
		}
		else if(avg>=59)
		{
			System.out.println("First");
		}
		else if(avg>=49)
		{
			System.out.println("Second");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}