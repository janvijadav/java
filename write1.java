import java.io.*;
public class write1 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("C:/janvi/java/test1.txt");
        fos.write(65);
        fos.close();
    }    
}

//A