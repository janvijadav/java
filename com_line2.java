//second method command line argu....[5 program]

class com_line2
{
	public static void main(String args[])
	{
		int i, sum=0, l, n;
		float avg;
		l=args.length;
		for(i=0;i<l;i++)
		{
			System.out.println(args[i]);
			n=Integer.parseInt(args[i]);
			sum+=n;
		}
		avg=sum/l;
		System.out.println("sum ="+sum);
		System.out.println("avg ="+avg);
	}
}