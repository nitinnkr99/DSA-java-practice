import java.sql.SQLOutput;
import java.util.Scanner;
//fibonacci is like 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21....
public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the no, of terms : ");
        int n = inp.nextInt();
        int p = 0;
        int q =1;

        while (n>=1){
            int temp = q; // temp = 3
            q = p + temp; // q = 2 + 3 = 5
            p = temp; //p = 3
            n--;
        }
        System.out.println(p);



    }
}
