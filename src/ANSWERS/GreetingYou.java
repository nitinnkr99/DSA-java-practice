package ANSWERS;
import java.util.Scanner;
public class GreetingYou {
    public static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.

        Scanner inp = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name = inp.next();

        System.out.println("Hello ," + name + "!");


    }
}
