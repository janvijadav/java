//Division.java

import java.util.*;
class prime_all
{
	public static void main(String args[])
	{
		int i,j,n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a n1:- ");
		n1 = sc.nextInt();
		System.out.println("Enter a n2:- ");
		n2 = sc.nextInt();
		for(i=n1; i<n2; i++)
		{
			for(j=2; j<i; j++)
			{
				if(i % j == 0)
					break;
			}
		if(i==j)
			System.out.println(i + "  ");
		}
	}
}

/*op:- 	
	Enter a n1:-40
	Enter a n2:-50
	
	41
	43
	47
	/*