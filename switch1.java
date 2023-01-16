//switch...[12]

import java.util.*;
class switch1
{
	public static void main(String args[])
	{
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter color code:-....");
		c = sc.next().charAt(0);
		switch(c)
		{
			case 'r':
			case 'R':
			System.out.println("Red");
			break;
			case 'g':
			case 'G':
			System.out.println("Green");
			break;
			case 'b':
			case 'B':
			System.out.println("Blue");
			break;
			default:
			System.out.println("Invalid color code......");
			break;
		}
	}
}