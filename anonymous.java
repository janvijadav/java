abstract class person
{
    abstract void eat();
}
class anonymous
{
    public static void main(String[] args) 
    {
        person p = new person() 
        {
            void eat()
            {
                System.out.println("Nice Fruits.");
            }
        };
        p.eat();
    }
}

//O/P:- Nice Fruits.