//comparing by value
import java.util.*;
public class comparing_by_value {
    public static void main(String[] args) 
    {
        Map map = new HashMap();
        map.put(1, "Janvi");
        map.put(2, "Bhumi");
        map.put(3, "Nilesh");
        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue())
        .forEach(System.out::println);
    }
}

/*
2=Bhumi
1=Janvi
3=Nilesh
 */