package A2;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height : ");
        float h = input.nextFloat();
        System.out.print("Enter the base : ");
        float b = input.nextFloat();

        System.out.print("Area of triangle is : " + (h * b)/2);
    }
}
