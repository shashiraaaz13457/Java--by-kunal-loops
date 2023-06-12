package A2;

import java.util.Scanner;

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class sum_of_negative_sum_of_even_positive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers: ");

        int nSum = 0,eSum = 0, oSum = 0;

        while(true){
            int n = in.nextInt();
            if (n == 0){
                break;
            }
            if (n < 0){
//                nSum = nSum + n;
                nSum += n;

            }
            else if (n % 2 == 0){
                eSum += n;
            }
            else {
                oSum += n;
            }
        }
        System.out.println("Negative no. Sum = " + nSum);
        System.out.println("Positive even no. Sum = " + eSum);
        System.out.println("Positive odd no. Sum = " + oSum);
    }
}
