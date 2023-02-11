interface A
{
    void dispA();
}
interface B
{
    void dispB();
}
class C
{
    void dispC()
    {
        System.out.println("Class C.");
    }
}
class D extends C implements A,B
{
    public void dispA()
    {
        System.out.println("Interface A.");
    }
    public void dispB()
    {
        System.out.println("Interface B.");
   }
    void dispD()
    {
        System.out.println("Class D.");
    }
}
class first 
{
    public static void main(String args[])
    {
        D d1 = new D();
            d1.dispA();
            d1.dispB();
            d1.dispC();
            d1.dispD();
    }
}


