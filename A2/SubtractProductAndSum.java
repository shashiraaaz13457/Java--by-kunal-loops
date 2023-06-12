package A2;
// leet code
//Subtract the product and sum  of digit of integer.

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int rem = 0;
        int sum = 0;
        int product = 1;

//        If condition isliye lga diya kyuki ek digit ke integer ko woh baar baar output 0 dega.(You can remove)
        if (num > 10){
            while (num > 0){
                rem = num % 10;
                sum = rem + sum;
                product = rem * product;
                num = num/10;
            }
            System.out.println(sum);
            System.out.println(product);
            System.out.println(product - sum);
        }
        else {
            System.out.println("Not valid Integer");
        }


    }
}
