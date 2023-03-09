//comparing by value
import java.util.*;
public class comparing_by_key {
    public static void main(String[] args) 
    {
        Map map = new HashMap();
        map.put(1, "Janvi");
        map.put(2, "Bhumi");
        map.put(3, "Nilesh");
        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .forEach(System.out::println);
    }
}


/*
1=Janvi
2=Bhumi
3=Nilesh
 */