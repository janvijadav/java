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
class C extends A
{
    void dispC()
    {
        System.out.println("Class C.");
    }
}
class inheri2
{      
    public static void main(String args[])
    {
        B b1;
        b1 = new B();
        b1.dispA();
        b1.dispB();
        //b1.dispC();
        C c1 = new C();
        c1.dispA();
        //c1.dispB();
		//c1.dispC();            
    }
}

/*
op class A.
	class B.
	class A.
*/
