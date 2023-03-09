//Java map interface
//generic
import java.util.*;
public class map2
{
    public static void main(String[] args) 
    {
        Map<Integer,String>map=new HashMap<Integer,String>();
        map.put(1, "Janvi");
        map.put(2, "Bhumi");
        map.put(3, "Nilesh");
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        for(Map.Entry m:map.entrySet())
        {
            Map.Entry entry =(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }   
}

/*
o/p:-
1 Janvi
2 Bhumi
3 Nilesh
 */