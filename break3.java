// Java program to demonstrate using break to terminate a
// sequence in a switch statement.[25]

class break3 {
	public static void main(String args[])
	{
		int i = 2;
		switch (i)
		{
		case 0:
			System.out.println("i is zero.");
			break;
		case 1:
			System.out.println("i is one.");
			break;
		case 2:
			System.out.println("i is two.");
			break;
		default:
			System.out.println("Invalid number");
		}
	}
}
