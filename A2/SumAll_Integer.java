package A2;
// Wohoo!! solved by myself(See one more time)
import java.util.Scanner;

public class SumAll_Integer {
    public static void main(String[] args) {
//        int n = 1;
        int sum = 0;
//        int temp;
        int num;


        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number: ");
            num = input.nextInt();
            if (num > 0){
                sum = sum + num;
            }
            else if (num == 0) {
                break;

            }
        }
        System.out.print("Sum of all integers is : " + sum);
    }
}
