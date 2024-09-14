import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //Switch is alternative for if - else-if conditionals
        /*Syntax:
        Switch (value){
            case "a":
                body;  //break is necessary otherwise if case a is true then all the conditions after
                break; //case "a" will become true and will be executed which you may not want.
            case "b":
                body;
                break;
            case "c":
                body;
                break;
            default:  //when no case is true you can optionally provide a default case which will
                body; //be executed as a default case and no break is necessary as the default case is written in the end
        }


         */

        //print the corresponding day for a given number like 1 for monday:

        Scanner read = new Scanner(System.in);
        int day = read.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default :
                System.out.println("ENTER A VALID NUMBER");
        }
        //so above is a normal switch case example isn't the syntax too much ???
        //for that we can enhance the syntax of same program by pressing alt+enter after selecting the switch word

        //just like this more clean , easier to read and debug!
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("ENTER A VALID NUMBER");
        }


    }
}
