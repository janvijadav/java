//multi inheritance..
class A  //grand parent
{
    void dispA()
    {
        System.out.println("Class A.");
    }
}
class B extends A //parent class
{
    void dispB()
    {
        System.out.println("Class B.");
    }
}
class C extends B //child class
{
    void dispC()
    {
        System.out.println("Class C.");
    }
}
class multi_inheri1
{
 public static void main(String[] args) 
 {
    C c1 = new C();
    c1.dispA();
    c1.dispB();
    c1.dispC();
 }
}

/*Class A.
Class B.
Class C. */