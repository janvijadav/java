	import java.util.*;  
	 class armstsrong
		{  
		static boolean isarmstrong(int n)   
		{   
		int a, j=0, k=0, sum=0;   
		a=n;   
		while(a>0)    
		{   
		a = a/10;   
		j++;   
		}   
		a = n;   
		while(a>0)   
		{   
		k = a % 10;   
		sum +=  (Math.pow(k, j));   
		a = a/10;   
		}  
		if(n==sum)   
		return true;      
		else return false;   
		}   
		public static void  main(String args[])     
		{     
		int num;   
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		num=sc.nextInt();  
		if(isarmstrong(num))  
		{  
		System.out.print("Armstrong ");  
		}  
		else   
		{  
		System.out.print("Not Armstrong ");  
		}  
	}   
	}  