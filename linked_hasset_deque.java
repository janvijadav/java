
import java.util.*;
public class linked_hasset_deque
{
    public static void main(String[] args) 
    {
        LinkedHashSet<String>set = new LinkedHashSet<String>();   
        set.add("Bhumi");    
        set.add("Kinjal");    
        set.add("Kinjal");
        set.add("Janvi");
        Iterator<String>itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }    
}

/*
O/P:-
Bhumi
Kinjal
Janvi
 */