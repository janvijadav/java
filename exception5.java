class MyException extends Exception
{
    MyException(String s)
    {
        super(s);
    }
} 

class exception5
{
    public static void main(String[] args) {
        try 
        {
            throw new MyException("Error Found.");
        }
        catch (Exception e) 
        {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}


/*
 MyException: Error Found.
Error Found.
 */