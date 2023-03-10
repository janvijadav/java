class vararge1 
{
static int sum(int...n)
{
    int sum = 0;
    System.out.println(" ");
    for(int n1:n)
    {
        System.out.println(n1 + " ");
        sum += n1;
    }
    return(sum);
}    
public static void main(String[] args) 
{
    System.out.println("Two args sum = "+sum (10,20));    
    System.out.println("Three args sum = "+sum (10,20,30));    
    System.out.println("Four args sum = "+sum (10,20,30,40));    
}
}

/*

10
20
Two args sum = 30

10
20
30
Three args sum = 60

10
20
30
40
Four args sum = 100
 */