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
                maximum(a,b,c);
            case "min":
                minimum();
        }

    }

    static int maximum( int a , int b , int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else return c;
        }
        else
            if (b>c){
            return b;
        }
            else return c;

    }
}
