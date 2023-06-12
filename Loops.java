import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//      Q.  Print no from 1 to 5

        /*
        Syntax of for loops:

        for (initialization; condition; increment/decrement){
//            body
        }
         */
        //      Q.  Print no from 1 to 5
//        for(int num = 1; num <= 5 ; num++){
//            System.out.println(num);
//        }

        // Using Input
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 1; num <= n; num++){
//            System.out.print(num + " ");
//        }

        // Syntax of while loops
        /*
        while(condition){
            //body
        }
         */

//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num++;
//        }

       // do while
        /*
        do{
            //body
        } while (condition);
         */

        int n = 1;
        do{
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
