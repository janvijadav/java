
class enum2 
{
    public enum season {Sunday, Monday, Tuesday, Wednesday} 
    public static void main(String[] args) 
    {
       {
        for(season s: season.values())
        System.out.println(s);  
       }   
        System.out.println("Value of Sunday is : "+season.valueOf("Sunday"));
        System.out.println("Index of Sunday is : "+season.valueOf("Sunday").ordinal());    
        System.out.println("Index of Monday is : "+season.valueOf("Monday").ordinal());    
    }  
}

/*
O/P:- 
Sunday
Monday
Tuesday
Wednesday
Value of Sunday is : Sunday
Index of Sunday is : 0
Index of Monday is : 1
 */