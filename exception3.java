import javafx.scene.CacheHint;

class exception3 
{
    public static void main(String[] args) {
        int a,b,c;
        try{
            a = Integer.parseInt(args [0]);
            b = Integer.parseInt(args [1]);
            System.out.println("/");
            c = a/b;
            System.out.println("C = "+ c);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Error");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Type mismatch error");
        }
        System.out.println("End");
    }    
}

/*
 O/P:
Array Index Error
End
 */