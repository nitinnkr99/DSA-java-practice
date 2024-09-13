package ANSWERS;
import java.util.Scanner;
public class LargestNo {
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int max = 0;
        if (a>b){
            max = a;
        }
        else if (b>a){
            max = b;
        }
        System.out.println("largest number is " + (max));
    }
}
