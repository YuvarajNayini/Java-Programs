public class Mymain{
    public static void main(String[] args){
        // Students s= new Students("Yuvaraj",30,"ERP Systems","A+",124777L);
        // System.out.print(s.details());
        /* with out static key word 
        // create object of class(calculator) then print the result of two numbers
        calculator cl = new (calculator);
       System.out.println(cl.add(3.1,2.3)); 
       System.out.println(cl.sub(2.0265,5.1246));
       System.out.println (cl.multiply(6.02158,0.95147));
       System.out.println (cl.divide(5.0,1.36));
    }*/
    // with static keyword
    // use class name (calculator) with a dot operator to access static methods
    // we can assign a variable to static method and use it or we can directly use them in print statement
    // Approach 1
    /*double x = calculator.add(3.1,2.3);
    System.out.println(x);
    // Approach 2
    System.out.println(calculator.add(3.1,2.3));
    System.out.println(calculator.divide(5,2));
    System.out.println(calculator.multiply(2,5));
    System.out.println(calculator.sub(9,7)); */
    // inheritence and over riding example
    Frog f = new Frog();
    f.type();
    f.adaptation();
    f.Swim();
    f.Walk(); // override
    }
}
// TYpe -1 commenting
/* this
 is
 type 2
 commenting
 */
