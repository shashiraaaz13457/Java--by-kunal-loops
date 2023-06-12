package A2;

import java.util.Scanner;

//Try it one more time (I have taken the hint)
public class PrintAllFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number ; i++) {
            if (number % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
