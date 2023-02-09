class B
{
    int sum (int a, int b)
    {
        System.out.println("int sum");
        return(a+b);
    }
    float sum (float a, float b)
    {
        System.out.println("float sum");
        return(a+b);
    }
}
class overload2
{
    public static void main(String args[])
    {
        float x=100, y=200;
        B b1 = new B();
        System.out.println("Sum of two int nos.="+b1.sum(10, 20));
        System.out.println("Sum of two float nos.="+b1.sum(x, y));
    }
}

