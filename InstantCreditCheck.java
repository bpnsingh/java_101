package chapter5;

/*
// * VARIABLE SCOPE
// * Write an ‘instant credit check’ program that approves
// * anyone who makes more than $25,000 and has a credit score
// * of 700 or better. Reject all others.
// */

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        boolean qualified = isUserQualified(creditScore, salary);
        notifyUser(qualified);

    }
    public static double getSalary() {
        System.out.println("Enter your salary: ");
        return scanner.nextDouble();
    }
    public static int getCreditScore() {
        System.out.println("Enter your credit score: ");
        return scanner.nextInt();
    }
    public static boolean isUserQualified(int creditScore, double salary) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        } else {
            return false;
        }
    }
    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congrats! You've been approved.");
        } else {
            System.out.println("Sorry, you've been declined.");
        }
    }


}
