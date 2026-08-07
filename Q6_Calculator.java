import java.util.Scanner;

public class Q6_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from the user till user does not press X or x
        int ans = 0;
        while (true) {
            // intput two numbers
            System.out.print("Enter two numbers : ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            // take the operator as input
            System.out.print("Enter the operator : ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if(op == '%'){
                ans = num1 % num2;
               }

            } else if(op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid Operation!!");
            }
            System.out.println(ans);
        }

    }
}
