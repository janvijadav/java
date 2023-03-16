import java.io.*;
public class byte_os 
{
    public static void main(String[] args) throws Exception
    {
        String s = "Hello java...";
        byte b[] = s.getBytes();
        FileOutputStream fos = new FileOutputStream("C:/janvi/java/test1.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.write(b);
        dos.close();
        fos.close();
    }        
}

//Hello java...