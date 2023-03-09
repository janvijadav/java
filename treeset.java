//Sorted set interface

import java.util.*;
public class treeset
{
    public static void main(String[] args) 
    {
        TreeSet<String>set = new TreeSet<String>();
        set.add("Janvi");    
        set.add("Bhumi");    
        set.add("Kinjal");
        set.add("Nilesh");
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
Janvi
Kinjal
Nilesh
 */