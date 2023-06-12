package A2;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the units : ");
        double units = input.nextDouble();
        double BillToPay = 0;

        if (units < 100){
            BillToPay = units * 8;
        } else if (units > 100) {
            BillToPay = 100 * 8 + (units - 100)*10;
        }
        System.out.print("The electricity bill for " + units + "is: " + BillToPay);
    }
}
