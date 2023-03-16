import java.io.*;
public class buffer_os 
{
    public static void main(String[] args) throws Exception
    {
        String s = "Hello java...";
        byte b[] = s.getBytes();
        FileOutputStream fos = new FileOutputStream("C:/janvi/java/test1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(b);
        bos.close();
        fos.close();
    }    
}


//Hello java...