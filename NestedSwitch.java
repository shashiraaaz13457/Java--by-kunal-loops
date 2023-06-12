import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

//        switch (empID){
//            case 1 :
//                System.out.println("Shashi Raj");
//                break;
//            case 2 :
//                System.out.println("Rahul Raj");
//                break;
//            case 3 :
//                System.out.println("EmpNo 3");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management" :
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No Department Entered");
//                }
//                break;
//            default:
//                System.out.println("Enter correct empID");
//        }
//    }

//        Enhanced form
        switch (empID) {
            case 1 -> System.out.println("Shashi Raj");
            case 2 -> System.out.println("Rahul Raj");
            case 3 -> {
                System.out.println("EmpNo 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department Entered");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
    }
}
