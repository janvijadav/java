class a{
    private int data = 30;
    class Inner
    {
        void msg()
        {
            System.out.println("data is "+data);
        }
    }
    public static void main(String[] args)
    {
        a obj = new a();
        a.Inner in = obj.new Inner();        
        in.msg();
    }
}

//O/P:- 30