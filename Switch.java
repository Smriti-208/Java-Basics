import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Syntax of Switch Statements:
        // (in switch statements, you can jump
        // to various cases based on your expression)
        // switch (expression){

        // //cases
        // case one:
        // //do something
        // break;

        // case two:
        // //do something
        // break;

        // default:
        // //do something
        // }
        // NOTE: - cases have to be the same type as expressions, must be a constant or
        // literal
        // - duplicate case values are not allowed
        // - break is used to terminate the sequence
        // - if break is not used, it will continue to next cases
        // - default will execute when non of the above does
        // - if default is not at the end , put break after it
        
        //EXAMPLE 1

        // String fruit = sc.next();

        // switch (fruit) {

        //     case "Mango":
        //         System.out.println("King of fruits");
        //         break;

        //     case "Apple":
        //         System.out.println("A sweet red fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("Round fruit");
        //         break;
        //     case "Grapes":
        //         System.out.println("Small fruit");
        //         break;
        //     default:
        //         System.out.println("Please enter a valid fruit");


        // EXAMPLE 2: 

        //better way to write switchs 
        // int day = sc.nextInt();
        // switch (day){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");


        // switch (day){
        //     case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
        //     case 6, 7 -> System.out.println("Weekend");
    // }



        // NESTED SWITCH 
        //EXAMPLE

        // int empID = sc.nextInt();
        // String department = sc.next();

        // switch(empID){
        //     case 1:
        //         System.out.println("Smriti Priyadarshi");
        //         break;
        //     case 2: 
        //         System.out.println("Anjali Shukla");
        //         break;
        //     case 3:
        //         System.out.println("Shashank Pratyush");
        //         switch (department){
        //             case "IT":
        //                 System.out.println("IT Department");
        //                 break;
        //             case "Management":
        //                 System.out.println("Management Department");
        //                 break;
        //             default:
        //                 System.out.println("No department entered");
        //         }
        //         break;
        //         default:
        //             System.out.println("Enter correct EmpId");

        // }
        }
        }
        

