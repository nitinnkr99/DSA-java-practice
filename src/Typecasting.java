import java.sql.SQLOutput;
import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        //automatic topic conversions
        Scanner inp = new Scanner(System.in);
        float a = inp.nextFloat();//even if i give integer value in float like 4 in a
        float b = inp.nextFloat();//and b = 5
        float c = a+b;// then c = 9.0 instead of giving any error it converts integer value implicitly to float


        System.out.println("SUM = " + c);// SUM = 9.0

        //explicit type casting
        int num = (int)(9.8f);


    }
}
