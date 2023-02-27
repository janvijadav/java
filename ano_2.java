interface Eatable
{
    void eat();
}
class ano_2 
{
    public static void main(String[] args) 
    {
        Eatable e = new Eatable() 
        {
            public void eat()
            {
                System.out.println("Nice Fruits.");
            }    
        };
        e.eat();
    }
}

//O/P:-  Nice Fruits.
