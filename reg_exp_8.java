import java.util.regex.*;
import java.util.Scanner;
import java.util.regex.Matcher;
public class reg_exp_8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter Regex Pattern");
            Pattern pattern = Pattern.compile(sc.nextLine());
            System.out.println("Enter text:- ");
            Matcher matcher = pattern.matcher(sc.nextLine());
            boolean found = false;
            while(matcher.find())
            {
                System.out.println("I found the text "+ matcher.group()+"Starting at index "+ matcher.start()+"and ending at index "+ matcher.end());
                found = true;
            }
            if(!found)
            {
                System.out.println("No Match Found.");
                break;
            }
        }
    }    
}

/*
Enter Regex Pattern
123
Enter text:-
145 789 123 0000
I found the text 123Starting at index 8and ending at index 11
 */