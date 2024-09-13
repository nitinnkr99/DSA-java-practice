package ANSWERS;
import java.util.Scanner;
import java.lang.String;
public class TwoCalculate {
    public static void main(String[] args) {
        //Take in two numbers and an operator (+, -, *, /) and calculate the value.
        //(Use if conditions)
        Scanner inp = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = inp.nextInt();
        System.out.print("enter second number: ");
        int num2 = inp.nextInt();
        System.out.print("enter a operation from (+ , * , - , /) : ");
        char opt = inp.next().charAt(0);
        inp.close();
        //if else to check the operations and perform them

        if (opt == '+'){//always write char or single character in single quotes ' '
            System.out.println("sum = " + (num1+num2));
        } else if( opt == '-'){
            System.out.println("difference =" + (num1-num2));
        } else if( opt == '*'){
            System.out.println("product =" + (num1 * num2));
        } else if (opt == '/'){
            if (num2 !=0 ){
                System.out.println("quotient = " + (num1 / num2));
            }
            else System.out.println("denominator can't be ZERO");
        }
        else {
            System.out.println("INVALID OPERATION");
        }


    }
}