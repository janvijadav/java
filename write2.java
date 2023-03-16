import java.io.*;
public class write2 
{
    public static void main(String[] args) 
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("C:/janvi/java/test1.txt");
            fos.write(66);
            fos.close();
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }    
}

//B