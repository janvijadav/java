//constuctor with argument & without argument...

class A  //without argument.
{
    void disp()
    {
        System.out.println("Class A.");
    }
}
class B extends A
{
    void disp()
    {
        System.out.println("Class B.");
    }
}
class constinheri1
{
    public static void main(String[] args)
    {
        B b1 = new B();
    }
}

// class B.