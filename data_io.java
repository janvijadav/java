import java.io.*;
public class data_io 
{
    public static void main(String[] args) throws Exception
    {
        String s = "Hello java...";
        byte b[] = s.getBytes();
        FileInputStream fis = new FileInputStream("C:/janvi/java/test1.txt");
        DataInputStream dis = new DataInputStream(fis);
        while ((b = dis.read())!=-1) 
        {
            System.out.println((char)b);
        }
        dis.close();
        fis.close();
    }        
}    

//Hello java...