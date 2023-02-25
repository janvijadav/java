public class classclass2
 {
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class class1 = Class.forName("java.lang.String");
        Class class2 = int.class;
        System.out.println("Class represented by class1: ");
        System.out.println(class1.toString());
        System.out.println("Class represented by class2: ");
        System.out.println(class2.toString());
        String s = "JavaTpoint";
        int i = 10;

        boolean b1 = class1.isInstance(s);
        boolean b2 = class1.isInstance(i);
        System.out.println("is p instance of String : " + b1);
        System.out.println("is j instance of String : " + b2);
    }
}

/*
 Class represented by class1:
class java.lang.String
Class represented by class2:
int
is p instance of String : true
is j instance of String : false
 */