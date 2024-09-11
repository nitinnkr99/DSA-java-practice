import java.util.Scanner;
public class InOp {
    public static void main(String[] args) {
        //there are two ways to take input from a user for different datatypes
        //1. BufferReaderClass 2.Scanner class
        String a;
        //Scanner class
        Scanner inp = new Scanner(System.in);
        //inp is a new object of Scanner class that has parameter
        // System.in which means to read input from keyboard

        a = inp.next();
        //next() reads next word
        //nextInt() reads integer value
        //nextLine() reads a complete line or string
        System.out.println(a);
    }
}
