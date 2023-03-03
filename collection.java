import java.util.*;  
class collection
{  
    public static void main(String args[])
    {  
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
        list.add("Ravi");//Adding object in arraylist  
        list.add("Vijay");  
        list.add("Ravi");  
        list.add("Ajay");  
        //Traversing list through Iterator  
        Iterator itr=list.iterator();  
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  
        ArrayList list1=new ArrayList();//Creating arraylist  
        Integer i1 = 12;
        list1.add(i1);//Adding object in arraylist  
        list1.add("Vijay");  
        list1.add(43.55);  
        list1.add("Ajay");  
        //Traversing list through Iterator  
        Iterator itr1=list1.iterator();  
        while(itr1.hasNext())
        {  
            System.out.println(itr1.next());  
        }  
    }  
}  



/*
 Ravi
Vijay
Ravi
Ajay
12
Vijay
43.55
Ajay
 */