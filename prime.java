//prime nos..

import java.util.*;
class prime
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:- ");
		n = sc.nextInt();
		for(i=2; i<n; i++)
		{
			if(n % i == 0)
				break;
		}
		if(n==i)
			System.out.println(n + " is prime ");
		else
			System.out.println(n + "is not prime ");
	}
}

/*op:- 
	Enter a no:- 5
	5 is prime
/*