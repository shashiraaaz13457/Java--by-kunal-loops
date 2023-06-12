package A2;

import java.util.Scanner;
// See one more time.
public class Average {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you want to average of : ");
        int num = input.nextInt();
        int count = 1;
        float avg;
        float sum = 0 ;

        while (count <= num){
            System.out.print("Enter the " + count + " number is : ");
            int num2 = input.nextInt();
            sum = sum + num2;
            count++;
        }
        avg = (sum)/num;
        System.out.print("Average of these " + num + " numbers is : " + avg);
    }
}
