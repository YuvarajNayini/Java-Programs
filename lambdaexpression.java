// to use lambda expression we need only functional interfaces which has only one abstract method
// it will not work with normal interface which has more than one abstract method
// It is anonymus function, with out name, access modifier and return type
// from java 8 interface method supports main method because it supports static method

@FunctionalInterface
interface FuncInterface{
int input(int a,int b);
}
@FunctionalInterface
interface StringChecker{
boolean input(String words,char letter);
}

public class lambdaexpression {
    public static void main(String[] args) {
        FuncInterface add =(a,b)->a+b;
        System.out.println(add.input(2,5));
        StringChecker sc = (words,letter)->words.indexOf(letter)>=0;
        System.out.println(sc.input("Hiii i am Yuvraj",'i'));
    }   
}
