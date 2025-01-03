package chapter4;

import java.util.Scanner;

public class GrossPayValidator {
    public static void main(String args[]){
        System.out.println("Enter number of hours worked");
        Scanner scanner = new Scanner(System.in);
        int workedHours = scanner.nextInt();
        while (workedHours > 40 || workedHours < 1) {
            System.out.println("Enter working hours beween 1 to 40");
            workedHours = scanner.nextInt();
        }
        int totalWage = workedHours * 100;
        System.out.println("your total wage is $"+totalWage );



    }
}
