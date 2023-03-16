import java.io.*;
import java.util.*;
public class write4 
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String s;
        FileOutputStream fos = new FileOutputStream("C:/janvi/java/test1.txt");
        while(true)
        {
            System.out.println("Enter String:- ");
            s = sc.nextLine();
            if(s.length()==0)
            break;
            byte b[] = s.getBytes();
            fos.write(b);
        }
        fos.close();
    }    
}

/*
 Enter String:-
janvi
Enter String:-
jadav
Enter String:-

janvijadav
 */