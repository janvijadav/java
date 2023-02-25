import java.util.*;
class exception2
{
    public static void main(String argc[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:- ");
        try
        {
            a=sc.nextInt();
            System.out.println("/");
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

/*
Enter a no:-
12
/
2
c=6
end
 */