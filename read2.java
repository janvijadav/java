import java.io.*;
public class read2 
{
    public static void main(String[] args) {
        try
        {
            int b;
            FileInputStream fis = new FileInputStream("C:/janvi/java/test1.txt");
            while((b = fis.read(null))!=-1);
            {
                System.out.println((char)b);
            }
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