package ANSWERS;
import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c =in.nextInt();

        System.out.print("What do you want max or min ? : ");
        String ch = in.next();

        switch ( ch ){
            case "max":
                System.out.println(maximum(a,b,c));
            case "min":
                System.out.println(minimum(a,b,c));
        }

    }

    static int maximum( int a , int b , int c){
        if(a>b){
            if (a>c) return a;
            else return c;
        }
        else {
            return Math.max(b, c);
        }
    }

    static int minimum(int a , int b , int c){
        if ( a < b && a < c){
            return a;
        }
        else
            if(b < c ){
            return b;
        }
            else return c;
    }
}
