class string1 
{
    public static void main(String[] args) {
        String s1 = "String using literal";
        String s2 = new String("String using new");
        char c1[] = {'a','b','c','d'};
        String s3 = new String(c1);
        System.out.println("s1 = "+s1);
        System.out.println("s2 ="+s2);
        System.out.println("s3 = "+s3);
        System.out.println("charAt(3) = "+s1.charAt(3));
        System.out.println("Substring() = "+s1.substring(3));
        System.out.println("contains() = "+s1.contains(s3));
        System.out.println("contains(U) = "+s1.contains("U"));
        System.out.println("join(aa,bb) = "+s1.join("&", "a","b","c"));
        String s4 = "abcd";
        if(s3.equals(s4))
            System.out.println("same");
        else
            System.out.println("Different");

        String s5 = "java";
        String s6 = "";
        System.out.println(s5.isEmpty());
        System.out.println(s6.isEmpty());

        String fname = "j";
        String lname = "s";
        System.out.println(fname.concat(lname));

        String n1 = "janvi";
        System.out.println(n1.replace('j', 'T'));
        
        String r1 = "java";
        String r2 = "JAVA";
        String r3 = "enymore..";
        System.out.println(r1.equalsIgnoreCase(r2));
        System.out.println(r1.equalsIgnoreCase(r3));

        String str = "Hello";
        String[] arrOfStr = str.split("@", 2);
        for (String a : arrOfStr)
        System.out.println(a);

        String Str = new String("Welcome-to-Tutorialspoint.com");
        System.out.println("Return Value :" );
        for (String retval: Str.split("-", 2)) {
           System.out.println(retval);
    }

    String Str1 = new String("Welcome ");
    System.out.print("Output:- " );
    System.out.println(Str1.intern());

        
     String str2 = "This is java program.";
    System.out.println("index of letter 's' = " 
       + str.indexOf('s')); 


    String Str3 = new String("Welcome to java ");
    System.out.print("Found Index :" );
    System.out.println(Str.indexOf( 'o', 5 ));
    
   
    String str4 = new String("Welcome to geeksforgeeks");
    System.out.print("Found g first at position : ");
    System.out.println(str4.indexOf('g'));
    

    String strInput = new String("hello world");
    String strSub = new String("world");
    System.out.print("Index found: " );
    System.out.println(strInput.indexOf(strSub, 3));


    String txt = "Hello World";
    System.out.println(txt.toLowerCase());


    String str6 = "Hello World";
    System.out.println(str6.toUpperCase());

    String myStr = "       Hello World!       ";
    System.out.println(myStr);
    System.out.println(myStr.trim());

    int value=30;  
    String str7=String.valueOf(value);  
    System.out.println(str7+10);//concatenating string with 10  
    }
}    

