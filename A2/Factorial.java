package A2;
//Not applicable for value larger than 12.
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = input.nextDouble();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = i * factorial;
        }
        System.out.print("Factorial of "+ num + " is : " + factorial);
    }
}
