package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main (String args[]) {
        boolean addAnotherNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the first number:");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter the second number:");
            int secondNumber = scanner.nextInt();
            int sum = firstNumber + secondNumber;
            System.out.println("The sum of the two numbers is: " + sum);
            System.out.println("Do you want to add another number, enter true or false");
            addAnotherNumber = scanner.nextBoolean();
        }while(addAnotherNumber);
        scanner.close();
    }

}
