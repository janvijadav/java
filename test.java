class test
{
    static int data = 30;
    static class Inner
    {
        void msg()
        {
            System.out.println("Data is "+data);
        }
    }
    public static void main(String[] args) 
    {
        test.Inner obj = new test.Inner();
        obj.msg();    
    }
}

//O/P:-  Data is 30
