//Create a regex that accepts 6 digits...
import java.util.regex.*;
public class reg_exp_6 
{
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-z0-9][6]","arun32"));
        System.out.println(Pattern.matches("[a-zA-z0-9][6]","KKvarun32"));
        System.out.println(Pattern.matches("[a-zA-z0-9][6]","JA20k2"));
        System.out.println(Pattern.matches("[a-zA-z0-9][6]","arun$2"));
        System.out.println(Pattern.matches("[a-zA-z0-9][6]","arun2"));
    }
}

/*
false
false
false
false
false
 */