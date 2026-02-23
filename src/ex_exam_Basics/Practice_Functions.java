package ex_exam_Basics;

import java.util.Scanner;

public class Practice_Functions {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = (num1>num2)? num1 : num2;
        System.out.println("Heighest number is " + result);
}
}
