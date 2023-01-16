//fibonaci series.....

import java.util.*;
class fibonaci
{
	public static void main(String args[])
	{
		int i,n,a=1,b=1,c;
		c=a+b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:- ");
		n = sc.nextInt();
		System.out.println(a + " " + b + " ");
		for(i=3; i<=n; i++)
		{
			c=a+b;
			System.out.println(c + " ");
			a=b;
			b=c;
		}
	}
}

//op:- C:\janvi\java>java fibonaci
/*Enter a no:-10
1
1
2
3
5
8
13
21
34
55*/