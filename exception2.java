import java.util.*;
class exception2
{
    public static void main(String argc[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        try
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c=a/b;
            System.out.println("c="+c);

        }
        catch(Exception e)
        {
            System.out.println("error"+e);
        }
        System.out.println("end");
    }
}