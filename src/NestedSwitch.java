import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        //Nested switch simply is a switch case in case of parent switch conditional
        System.out.print("post :");
        Scanner in = new Scanner(System.in);
        String post = in.nextLine().trim();

        switch (post) {
            case "ceo":
                System.out.println("Nitin Kumar");
                break;
            case "investor":
                System.out.println("kunal kushwaha");
                break;
            case "manager":
                System.out.print("branch name :");
                String branch = in.nextLine().trim();
                switch (branch) {
                    case "A":
                        System.out.println("simple chaudhary");
                        break;
                    case "B":
                        System.out.println("easy kaur");
                        break;
                    case "C":
                        System.out.println("funny singh");
                        break;
                    case "D":
                        System.out.println("difficult jha");
                        break;
                    default:
                        System.out.println("enter a valid branch");

                }
                break; //don't forget break here otherwise cases below case "manager" will be executed
            case "engineer":
                System.out.println("tom bakaa");
                break;
            default:
                System.out.println("Enter a valid post and department");

        }
    }
}
