import java.util.*;
class murphy
{
	public static void main(String args[])
	{
		int m,n,p,s,c=0;
		Scanner sc = new scanner(System.in);
		System.out.println("enter n:");
		int n = sc.nextInt();
		m=n;

	while(n>0)
	{
		c++;
		n=n/10;
	}
       s=m*m;
       p=pow(10,c);
       n=s%p;

       if(m==n)
		printf("\n %d is murphy",m);
       else
		printf("\n %d is not murphy",m);
	}
}