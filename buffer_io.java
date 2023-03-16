import java.io.*;
public class buffer_io 
{
    public static void main(String[] args) throws Exception
    {
        int b;
        FileInputStream fis = new FileInputStream("C:/janvi/java/test1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        while((b = bis.read())!=-1)
        {
            System.out.println((char)b);
        }
        bis.close();
        fis.close();
    }     
}

//Hello java...
