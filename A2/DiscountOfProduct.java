package A2;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the product Marked price value: ");
        int Marked_Price = input.nextInt();
        System.out.print("Enter the discount rate : ");
        int discount_rate = input.nextInt();

        int discount = Marked_Price * (discount_rate)/100;
        int Selling_Price = Marked_Price - discount;
        System.out.println("The amount you have to pay is: " + Selling_Price);
        System.out.print("You are saving :  " + discount);


    }
}
