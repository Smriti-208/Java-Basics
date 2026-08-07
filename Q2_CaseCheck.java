import java.util.Scanner;

public class Q2_CaseCheck{
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);
        //  1. next() - reads the next word(intput) from the keyboard
        //  2. trim() - removeestra spaces from the begaining and end of the intput
        //  3. charAt(0) = returns the character at index 0 of a string(the first charater of it)


        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else{
            System.out.println("Uppercase");
        }

    }
} 
