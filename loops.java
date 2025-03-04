import java.util.Arrays;
import java.util.List;
public class loops
{
    public static void main(String[] args)
    {
        //For loop
    System.out.println("===For loop===");
    for(int i=0;i<=9;i++) // intitilizer,boolean condition, iterater as per length of the condition
    {
        System.out.println(i);
        
    }
    System.out.println("===Enhanced Loop===");
        // Enhanced Loop
    List<Integer> numbers=Arrays.asList(2,3,4,5,6,7,8,9);
    List<String> names=Arrays.asList("Tony","Pony","Rony","Loony");
    for(Integer n : numbers)
    {
        System.out.println(n);
        
    }
    System.out.println("============");
    for(String n1 : names)
    {
        System.out.println(n1);
    }
    System.out.println("===While Loop===");
    //While Loop
    int i=0;
    while(i<5){
        System.out.println(i);
        i++;
    }
    int a =0;
    while(a<5){
        System.out.println("Yuvaraj");
        a++;
    }
    }
}
