//armstrong
import java.util.*;
 class aarm
 {
	 public static void main(String args[])
	 {
		 int n,r,s=0,i;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter no.:- ");
		 n=sc.nextInt(); 
		 i=n;
		 while(n>0)
		 {
			r=n%10;
			s=s+(r*r*r);
			n=n/10;
		 }
		 if(i==s)
			 System.out.println("armstrong");
		 else
			 System.out.println("not armstrong ");
	 }
 }