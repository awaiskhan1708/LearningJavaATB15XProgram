package ex_exam_Basics;

import java.util.Scanner;

public class ProblemStatement_Two {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if(scan.hasNextInt()) {
            int num = scan.nextInt();
            if (num % 2 == 0)
                System.out.println("The number is even");
            else
                System.out.println("The number is odd");
        }else
            System.out.println("Enter valid input");
    }
}
