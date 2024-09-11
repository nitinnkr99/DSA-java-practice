package ANSWERS;
import java.util.Scanner;
public class SimpleInterest {
    //Write a program to input principal, time, and rate (P, T, R) from the user and
    //find Simple Interest.
    public static void main(String[] args) {
        System.out.println("enter Principal value : P");
        Scanner inp = new Scanner(System.in);
        int P = inp.nextInt();

        System.out.println("enter Rate : R");
        int R = inp.nextInt();

        System.out.println("enter Time : T");
        int T = inp.nextInt();

        int SI = (P*R*T) / 100;
        System.out.println("Simple interest : " + SI);

    }


}
