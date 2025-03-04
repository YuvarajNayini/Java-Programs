//import java.util.ArrayList;
import java.util.Scanner;
public class CarShopping{
//IF_ELSE
public static void main(String[] args){
     // Create Scanner object to take user input
    Scanner s = new Scanner(System.in);
       // Ask the user to input the car price
    /*System.out.println("Enter Car price: ");
    int car_price = s.nextInt();
    float discount;
    float final_price=0;
    if(car_price>=150){
        discount = car_price * 0.01f;
        final_price=car_price-discount;
        System.out.println("Your final price is: "+final_price);
        }
    else if (car_price>=200){
        discount = car_price*0.03f;
        final_price=car_price-discount;
        System.out.println("Your final price is: "+final_price);
    }
    else if (car_price>=250){
        discount = car_price*0.05f;
        final_price=car_price-discount;
        System.out.println("Your final price is: "+final_price);
    }
    else{
        System.out.println("Not Eligble for Discount");
        System.out.println("Your final price is: "+car_price);
    }*/
// Switch cases
// calculator
System.out.println("Calculator Options");
System.out.println("1) Addition");
System.out.println("2) Multiplication");
System.out.println("3) Substraction");
System.out.println("4) Division");
// User input
System.out.println("Choose from above 1 to 4 options : ");
int choice=s.nextInt();
if (choice>=5){
    System.out.println("Invalid choice, select from 1 - 4");
}
else{
System.out.println("Enter num1: ");
double num1=s.nextDouble();
System.out.println("Enter num2: ");
double num2=s.nextDouble();
double result =0;
switch (choice){
    case 1:
    System.out.println("You choosed Addition");
    result=num1+num2;
    System.out.println("Result "+ result);
    break;
    case 2:
    System.out.println("You choosed Multiplication");
    result=num1*num2;
    System.out.println("Result "+ result);
    break;
    case 3:
    System.out.println("You choosed Substraction");
    result=num1-num2;
    System.out.println("Result "+ result);
    break;
    case 4:
    System.out.println("You choosed Division");
    if (num2!=0){// checking if num 2 is 0 
    result=num1/num2;
    System.out.println("Result "+ result);
    }
    else{
        System.out.println("Num1 cannot be divisible by zero");
    }
    break;
}
s.close();
}
}
}
