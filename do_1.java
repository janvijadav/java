import java.util.*;
class do_1
{
    public static void main(String args[]) {
        int n,r,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:- ");
        n = sc.nextInt();
        do
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        while(n>0);
        System.out.println("s = "+s);
    }
}