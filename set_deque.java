import java.util.*;
public class set_deque 
{
    public static void main(String[] args) 
    {
        HashSet<String>set = new HashSet<String>();
        set.add("Janvi");    
        set.add("Bhumi");    
        set.add("Kinjal");    
        Iterator<String>itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }    
}

/*
o/P:-
Kinjal
Bhumi
Janvis
 */