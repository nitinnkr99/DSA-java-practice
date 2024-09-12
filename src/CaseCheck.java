import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word to check case : ");
        char ch = in.next().trim().charAt(0);

        if (ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }
        else if('A'<=ch && 'Z'>=ch){
            System.out.println("uppercase");
        }


    }
}
