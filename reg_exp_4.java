//regex Quantifiers..
import java.util.regex.*;
public class reg_exp_4
{
    public static void main(String[] args) 
    {
        System.out.println("? Quantifiers...");
        System.out.println(Pattern.matches("[amn]?","a"));    
        System.out.println(Pattern.matches("[amn]?","aaa"));    
        System.out.println(Pattern.matches("[amn]?","ammmnn"));    
        System.out.println(Pattern.matches("[amn]?","aazzta"));    
        System.out.println(Pattern.matches("[amn]?","am"));    
        System.out.println("+ Quantifiers...");
        System.out.println(Pattern.matches("[amn]+", "a"));
        System.out.println(Pattern.matches("[amn]+", "aaa"));
        System.out.println(Pattern.matches("[amn]+", "aammnn"));
        System.out.println(Pattern.matches("[amn]+", "aazata"));
        System.out.println("* Quantifiers...");
        System.out.println(Pattern.matches("[amn]*", "ammna"));
    }    
}

/*
? Quantifiers...
true
false
false
false
false
+ Quantifiers...
true
true
true
false
* Quantifiers...
true
 */