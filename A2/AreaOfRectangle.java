package A2;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length : ");
        float l = input.nextFloat();
        System.out.print("Enter the breadth : ");
        float b = input.nextFloat();

        System.out.print("Area of Rectangle is : " + (l*b));
    }
}
