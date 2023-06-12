package A2;

import java.util.Scanner;

public class Commission_Amount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        double amount = input.nextDouble();

        System.out.print("Enter the commission Percentage : ");
        double commissionPercentage = input.nextDouble();

        double commission = amount * (commissionPercentage/100);
        System.out.println("The commission amount is : " + commission);

    }
}
