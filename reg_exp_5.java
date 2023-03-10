//Regex Metacharacter...
import java.util.regex.*;
public class reg_exp_5
{
    public static void main(String[] args) 
    {
        System.out.println("Metacharacter d...");
        System.out.println(Pattern.matches("[\\d]?","abc"));    
        System.out.println(Pattern.matches("[\\d]?","1"));    
        System.out.println(Pattern.matches("[\\d]?","4443"));    
        System.out.println(Pattern.matches("[\\d]?","323abc"));        
        System.out.println("Metacharacter D...");
        System.out.println(Pattern.matches("[\\D]+", "abc"));
        System.out.println(Pattern.matches("[\\D]+", "1"));
        System.out.println(Pattern.matches("[\\D]+", "4443"));
        System.out.println(Pattern.matches("[\\D]+", "323abc"));
        System.out.println(Pattern.matches("[\\D]+", "m"));
        System.out.println("Metacharacter D with quantifiers...");
        System.out.println(Pattern.matches("\\D*", "ma$c"));
    }    
}

/*
Metacharacter d...
false
true
false
false
Metacharacter D...
true
false
false
false
true
Metacharacter D with quantifiers...
true
 */