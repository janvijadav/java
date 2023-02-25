import java.util.Scanner;

class exception4
{
    static void func1()
    {
        System.out.println("Func1");   
    try 
    {
        func2();    
    } catch (Exception e) 
    {
        System.out.println("Catch func1");
    }
    }
static void func2()
{
    System.out.println("Func2");
    try 
    {
        func3();    
    } 
    catch (NumberFormatException e) 
    {
        System.out.println("Catch func2");
    }
}
static void func3()
{
    System.out.println("Func3");
    try 
    {
        func4();    
    } 
    catch (Exception e) 
    {
        System.out.println("Catch func3");
        throw e;
    }
}
static void func4()
{
    System.out.println("Func4");
    try
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter two no:- ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a/b;
        System.out.println("c = "+c);
    }
    catch(Exception e)
    {
        System.out.println("Catch func4");
        throw e;
    }
}

/*
 O/P:-
Func1
Func2
Func3
Func4
Enter two no:-
12
2
c = 6
 */
public static void main(String args[])
{
    func1();
}
}