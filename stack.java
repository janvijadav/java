import java.util.*;
public class stack 
{
    public static void main(String[] args) 
    {
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Bhumi");
        stack.push("Nilesh");
        stack.push("Kinjal");
        Iterator<String> itr = itr = stack.iterator();
        System.out.println("pop(Deleted)= "+stack.iterator());
        Iterator<String> itr1 = stack.iterator();
        while (itr1.hasNext()) 
        {
            System.out.println(itr1.next());
        }
    }
}

/*
 Ayush
Bhumi
Nilesh
Kinjal
 */
