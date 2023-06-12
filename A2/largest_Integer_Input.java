package A2;
// solve one more time, you take the hint to find largest number.
import java.util.Scanner;

public class largest_Integer_Input {
    public static void main(String[] args) {
        int big = 0;

        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int num = input.nextInt();
            if(big < num){
                big = num;
            }
            else if (num == 0){
                break;
            }
        }
        System.out.print("Largest number is : " + big);
    }
}
