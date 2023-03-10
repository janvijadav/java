//Regex character classes...
import java.util.regex.*;
public class reg_exp_3 
{
    public static void main(String[] args) 
    {
        System.out.println(Pattern.matches("[amn]","abcd"));    
        System.out.println(Pattern.matches("[amn]","a"));    
        System.out.println(Pattern.matches("[amn]","ammmnn"));    
        System.out.println(Pattern.matches("[amn]","n"));    
        System.out.println(Pattern.matches("[a-dm-p]","h"));    
    }    
}

/*
false
true
false
true
false
 */