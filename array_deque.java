//Deque Interface(Double ended interface)this work based on Fifo method.

import java.util.*;
public class array_deque
{
    public static void main(String[] args) 
    {
        Deque<String>deque=new ArrayDeque<String>();
        deque.add("Ravi");   
        deque.add("Ajay");   
        deque.add("Vijay");   
        deque.add("Ravi1");
        for(String str : deque)
        {
            System.out.println(str);
        }   
    }
}


/*
O/P:-
Ravi
Ajay
Vijay
Ravi1
 */