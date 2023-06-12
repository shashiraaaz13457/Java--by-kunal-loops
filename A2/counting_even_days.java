package A2;
//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
//Try it one more time.
public class counting_even_days {
    public static void main(String[] args) {
        String month = "August";
        int even_days = 0;
        for (int days = 1; days <= 31 ; days++) {
            if (days % 2 == 0){
                even_days += 1;
            }
        }
        System.out.println("Number of days kunal go out in the month of "+ month+" is : " + even_days);
    }
}
