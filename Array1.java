//array1.java[2 program]

class Array1
{
	public static void main(String args[])
	{
		int[]a=new int[5];
		for(int i=0; i<5; i++)
			a[i]= (i+1)*10;
		for(int i=0; i<5; i++)
			System.out.println(a[i]);
	}
}
	