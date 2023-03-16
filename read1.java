import java.io.*;
public class read1 
{
    public static void main(String[] args) 
    {
        try
        {
            int b;
            FileInputStream fis = new FileInputStream("C:/janvi/java/test1.txt");
            b = fis.read(null);
            System.out.println((char)b);
            fis.close();
        }    
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }    
}

//Error
//Hello java...