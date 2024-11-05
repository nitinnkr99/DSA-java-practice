package ANSWERS;
import java.util.Scanner;
public class MeasurementCalculator {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /*
1. Area Of Circle Java Program
2. Area Of Triangle
3. Area Of Rectangle Program
4. Area Of Isosceles Triangle
5. Area Of Parallelogram
6. Area Of Rhombus
7. Area Of Equilateral Triangle
8. Perimeter Of Circle
9. Perimeter Of Equilateral Triangle
10. Perimeter Of Parallelogram
11. Perimeter Of Rectangle
12. Perimeter Of Square
13. Perimeter Of Rhombus
14. Volume Of Cone Java Program
15. Volume Of Prism
16. Volume Of Cylinder
17. Volume Of Sphere
18. Volume Of Pyramid
         */
        System.out.print("Shape: ");

        String shape = in.next();
        switch (shape) {
            case "rectangle":
            case "Rectangle":
                rectangle();
            case "square":
            case "Square":
                square();
            case "Circle":
            case "circle":
                circle();
        }
    }




    static void rectangle(){
        System.out.print("enter length : ");
        int l = in.nextInt();
        System.out.println();
        System.out.print("enter breadth : ");
        int b = in.nextInt();
        System.out.println("Perimeter or Area");
        String choice = in.next();
        if (choice.equals("perimter") || choice.equals("Perimeter")){
            int p = 2 * (l + b);
            System.out.println("perimeter : " +  p);
        }
        else if (choice.equals("Area") || choice.equals("area")){
            int a = l * b;
            System.out.println("Area : " + a);
        }
        else {
            System.out.println("INVALID OPERATION");
        }
    }

    static void square() {
        System.out.print("enter Side length : ");
        int l = in.nextInt();
        System.out.println("Perimeter or Area");
        String choice = in.next();
        if (choice.equals("perimeter") || choice.equals("Perimeter")){
            int p = 4 * l;
            System.out.println("perimeter : " +  p);
        }
        else if (choice.equals("Area") || choice.equals("area")){
            int a = l * l;
            System.out.println("Area : " + a);
        }
        else {
            System.out.println("INVALID OPERATION");
        }
    }

    static void circle(){
        System.out.print("Enter radius : ");
        int l = in.nextInt();
        System.out.println("Circumference or Area");
        String choice = in.next();
        if (choice.equals("circumference") || choice.equals("Perimeter")){
            int p = 4 * l;
            System.out.println("perimeter : " +  p);
        }
        else if (choice.equals("Area") || choice.equals("area")){
            int a = l * l;
            System.out.println("Area : " + a);
        }
        else {
            System.out.println("INVALID OPERATION");
        }
    }

    static void triangle(){
        System.out.print("Isosceles or Equilateral");
        String ch = in.next();
        if (ch.equals("Isosceles") ){
            System.out.print("Enter height");
            int height = in.nextInt();
            System.out.print("\n");
            System.out.print("Enter base");
            int base = in.nextInt();
            System.out.print("Area or Perimeter");
            String choice = in.next();
            if (choice.equals("Area")){
                int area = ((1/2) * height * base);
                System.out.println(area);
            }
            if (choice.equals("perimeter")){
                int perimeter = 2 * ( height + base );
                System.out.print(perimeter);
            }

        }
        if (ch.equals("Equilateral")){
            System.out.print("Enter side");
            int side = in.nextInt();
            System.out.print("Area or perimeter");
            String choice = in.next();
            if ( choice.equals("Area")){
                double ar = 0.433012702 * side * side;
                System.out.print(ar);
            }
            if (choice.equals("Perimeter")){
                double per = 3 * side;
                System.out.print(per);
            }
        }
    }
}
