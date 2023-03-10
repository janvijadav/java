//Create a regex that accepts 10 digits...
import java.util.regex.*;
public class reg_exp_7 
{
    public static void main(String[] args) 
    {
        System.out.println("By Character classes and quantifiers...");
        System.out.println(Pattern.matches("[789[1][0-9][9]]","9953038945"));
        System.out.println(Pattern.matches("[789[0-9][9]]","9953038945"));
        System.out.println(Pattern.matches("[789[0-9][9]]","99530389450"));
        System.out.println(Pattern.matches("[789[0-9][9]]","6953038945"));
        System.out.println(Pattern.matches("[789[0-9][9]]","8853038945"));
        System.out.println("By Metacharacter...");
        System.out.println(Pattern.matches("[789[0-9][9]]","8853038949"));
        System.out.println(Pattern.matches("[789[0-9][9]]","3853038949"));
    }
}

/*
By Character classes and quantifiers...
false
false
false
false
false
By Metacharacter...
false
false
 */