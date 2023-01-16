//labeledbreak....[23]

class Labeledbreak1
{
    public static void main(String[] args)
	{
   
        // the for loop is labeled as first   
        first:
        for( int i = 1; i <= 10; i++) 
		{

            // the for loop is labeled as second
            second:
            for(int j = 1; j <= 5; j ++ ) 
			{
                System.out.println("i = " + i + "; j = " +j);
             
                // the break statement breaks the first for loop
                if ( i == 10)
                    break first;
            }
        }
    }
}


/*o/p:-

C:\janvi\java>javac Labeledbreak1.java

C:\janvi\java>java Labeledbreak1
i = 1; j = 1
i = 1; j = 2
i = 1; j = 3
i = 1; j = 4
i = 1; j = 5
i = 2; j = 1
i = 2; j = 2
i = 2; j = 3
i = 2; j = 4
i = 2; j = 5
i = 3; j = 1
i = 3; j = 2
i = 3; j = 3
i = 3; j = 4
i = 3; j = 5
i = 4; j = 1
i = 4; j = 2
i = 4; j = 3
i = 4; j = 4
i = 4; j = 5
i = 5; j = 1
i = 5; j = 2
i = 5; j = 3
i = 5; j = 4
i = 5; j = 5
i = 6; j = 1
i = 6; j = 2
i = 6; j = 3
i = 6; j = 4
i = 6; j = 5
i = 7; j = 1
i = 7; j = 2
i = 7; j = 3
i = 7; j = 4
i = 7; j = 5
i = 8; j = 1
i = 8; j = 2
i = 8; j = 3
i = 8; j = 4
i = 8; j = 5
i = 9; j = 1
i = 9; j = 2
i = 9; j = 3
i = 9; j = 4
i = 9; j = 5
i = 10; j = 1
*/
