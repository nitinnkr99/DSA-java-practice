import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // take a value from user and reverse it
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();

        //we can use the modulo "%" operator to get the last digit of a number and then
        //find a way to store them in a var one after another
        int ans = 0;
        while (a != 0){
            int n = a % 10 ;//this will give us last digit
            ans = (ans * 10) + n;//suppose a = 79 then n = 9 and ans would become 9 and then again loop will run
            a = a / 10; //and then a will become 7 and n = 7 and ans = 90 + 7 and hence ans = 97 <=> 79 :))
        }
        System.out.println(ans + "      :)");

    }
}
