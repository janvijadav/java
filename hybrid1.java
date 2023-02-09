//hybrid inheritance...

class A
{
    void dispA()
    {
        System.out.println("Class A.");
    }
}
class B extends A
{
    void dispB()
    {
        System.out.println("Class B.");
    }
}
class C extends B
{
    void dispC()
    {
        System.out.println("Class C.");
    }
}
class D extends B
{
    void dispD()
    {
        System.out.println("Class D.");
    }
}
class hybrid1
{
    public static void main(String args[])
    {
        C c1 = new C();
        c1.dispA();
        c1.dispB();
        c1.dispC();
        D d1 = new D();
        d1.dispA();
        d1.dispB();
        d1.dispD();
    }
}

/*
 Class A.
Class B.
Class C.
Class A.
Class B.
Class D.
 */