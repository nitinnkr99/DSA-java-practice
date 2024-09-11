import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        System.out.println("Program to find the largest of three numbers using if-else");

        //taking the input from user :
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        //let a = max and compare ba and c with max whichever if condition will be
        //true will give us the max :

//        int max = a;
//        if ( b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//
//        System.out.println(max);

        //this whole code can be written in different ways:
//        int max = 0; //set max= 0
//        if ( a > max){
//            max = a;
//        }
//        if ( b > max){
//            max = b;
//        }
//        if ( c > max){
//            max = c;
//        }
//        System.out.println(max);

        //we can also use inbuilt max function of java
    //this inbuilt function returns the larger of two int , long , float or double
        int largest = Math.max(c , Math.max(a ,b));

        System.out.println(largest);

    }
}
