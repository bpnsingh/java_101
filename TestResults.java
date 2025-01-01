package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number out of 100 :");
        int total = scanner.nextInt();
        char grade;
        if (total < 60)
            grade = 'F';
        else if (total < 70)
            grade = 'D';
        else if (total < 80)
            grade = 'C';
        else if (total < 90)
            grade = 'B';
        else
            grade = 'A';
        System.out.println("Your grade is :" + grade);
    }
}