import java.util.*;
class while_1
{
    public static void main(String[] args) {
        int n,r,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:- ");
        n = sc.nextInt();
        while(n>0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println("s = "+s);
    }
}