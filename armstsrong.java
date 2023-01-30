	import java.util.*;  
	 class armstsrong
		{  
		static boolean isarmstrong(int n)   
		{   
		int temp, j=0, k=0, sum=0;   
		temp=n;   
		while(temp>0)    
		{   
		temp = temp/10;   
		j++;   
		}   
		temp = n;   
		while(temp>0)   
		{   
		k = temp % 10;   
		sum +=  (Math.pow(k, j));   
		temp = temp/10;   
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