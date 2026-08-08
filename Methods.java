import java.util.Scanner;

public class Methods{
    
    // Syntax of creating a Method/Function:

    // return_type name ()  {    you call the functions by ()
    //     body 
    //     return statement;
    // }

    //returns the value of that particular method and we store it in an int return type variable
    public static void main(String[] args){
        int ans = sum2();
        System.out.println(ans);
    }
    static int sum2(){
           Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum = " + sum);
        return sum;   //sum is the vaule of sum2() function
    }




    //return nothing that's why we wrote "void" return type

    // public static void main(String[] args){
    //   sum();  
    // }
    // static void sum (){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter number 1: ");
    //     int num1 = sc.nextInt();
    //     System.out.print("Enter number 2: ");
    //     int num2 = sc.nextInt();
    //     int sum = num1 + num2;
    //     System.out.println("The Sum = " + sum);
    // }
}