// Java program to demonstrates labeled continue statement[26]

class continue1
{
	public static void main(String args[])
	{
	// First label
	first:
		for (int i = 0; i < 3; i++) 
		{
		// Second label
		second:
			for (int j = 0; j < 3; j++) 
			{
				if (i == 1 && j == 1) 
				{

					// Using continue statement with label
					continue first;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}
