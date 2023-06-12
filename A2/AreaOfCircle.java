package A2;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float r = input.nextFloat();

        System.out.print("Area is : " + (3.14 * r * r));
    }
}
