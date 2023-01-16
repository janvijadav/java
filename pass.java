//pass,fail & atkt...[8 pro..]


import java.util.*;
class pass
{
	public static void main(String args[])
	{
		int marks1,marks2,marks3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of three sub....");
		marks1=sc.nextInt();
		marks2=sc.nextInt();
		marks3=sc.nextInt();
		if(marks1>=40 && marks2>=40 && marks3>=40)
		{
			System.out.println("Pass.. ");
		}
		else if(marks1>=40 && marks2>=40 && marks3>=40)
		{
			System.out.println("Atkt.. ");
		}
		else if(marks1>=40 && marks2>=40 && marks3>=40)
		{
			System.out.println("Atkt.. ");
		}
		else
		{
			System.out.println("Fail...");
		}
	}
}