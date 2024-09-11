package ANSWERS;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        // Write a program to print whether a number is even or odd, also take
        //input from the user.

        //solution : if a number is even then it will be divisible by 2

        //take input
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();

        //we need to print even and odd on the basis of a condition so we can use if-else
        //and check if a num is divisible by 2 then it's even otherwise odd.

        if (num % 2 == 0){
            System.out.println("EVEN");
        }
        else System.out.println("ODD");
    }
}
