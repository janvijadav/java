import java.util.*;
public class priority_queue {
    public static void main(String[] args) {
        PriorityQueue<String>queue = new PriorityQueue<String>();
        queue.add("Janvi");
        queue.add("Bhumi");
        queue.add("Kinjal");
        queue.add("Nilesh");
        queue.add("Satydeep");
    System.out.println("Head element :-" +queue.element());
    System.out.println("Head peek :-" +queue.peek());
    System.out.println("iteractor the queue element:- ");
    Iterator itr = queue.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
    System.out.println("Remove ="+queue.remove());
    System.out.println("poll = "+queue.poll());
    System.out.println("After removing two numbers: -");
    Iterator<String> itr2 = queue.iterator();
    while (itr2.hasNext()) 
    {
        System.out.println(itr2.next());    
    }
    }
}

/*
Head element :-Bhumi
Head peek :-Bhumi
iteractor the queue element:-
Bhumi
Janvi
Kinjal
Nilesh
Satydeep
Remove =Bhumi
poll = Janvi
After removing two numbers: -
Kinjal
Nilesh
Satydeep
 */