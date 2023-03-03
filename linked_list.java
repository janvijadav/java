import java.util.*;
public class linked_list
{
    public static void main(String[] args) 
    {
        LinkedList<String> s1 = new LinkedList<String>();
        s1.add("Ravi");    
        s1.add("Vijay");    
        s1.add("Ravi");    
        s1.add("Ajay");
        Iterator<String> itr = s1.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());    
        }    
    }
}

/*
 Ravi
Vijay
Ravi
Ajay
 */