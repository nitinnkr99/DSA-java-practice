package ANSWERS;
import java.util.Scanner;
public class IsArmstrong {
    public static void main(String[] args) {
        //To find Armstrong Number between two given number.
        //153 = 1**3 + 5**3 + 3**3 = 153 that's a Armstrong number
        System.out.print("enter a number: ");
        Scanner input = new Scanner(System.in);
        int ans = input.nextInt();
        System.out.println(Armstrong(ans));

    }
    static Boolean Armstrong(int a){
        int org = a;
        int sum = 0;
        while(a>0){
            int rem = a%10;
            int cube = rem*rem*rem;
            sum = sum + cube;
            a = a/10;
        }
        return sum == org; //if sum value is not equal to the original one it will give error
    }
}
