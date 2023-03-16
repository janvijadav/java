import java.io.*;
public class write3 
{
    public static void main(String[] args) throws Exception
    {
        String s = "Hello java";
        FileOutputStream fos = new FileOutputStream("C:/janvi/java/test1.txt");
        byte b[]=s.getBytes();
        fos.write(b);
        fos.close();
    }    
}

//Hello java