import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        /*
        CONDITIONALS AND LOOPS :
        SYNTAX OF if-else :
        if(boolean condition){
            body of if executes when true;
        }
        else {
            body of else executes when if is false;
        }
         */
        System.out.println("ENTER the SALARY  : ");
        Scanner inp = new Scanner(System.in);
        int sal = inp.nextInt();
        if (sal > 10000){
            sal = sal + 3000;
        }
        else {
            sal = sal + 1500;
        }
        System.out.println(sal);

    }
}
