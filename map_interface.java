//Java map interface
//Non-generic
import java.util.*;
public class map_interface {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "Janvi");
        map.put(2, "Bhumi");
        map.put(3, "Nilesh");
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext())
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

