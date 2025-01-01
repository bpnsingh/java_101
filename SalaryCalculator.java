package chapter3;
import java.util.Scanner;
// calulatete the salary of an employee based on the number of hours worked and the hourly rate
// flat salary is 1000 $ per week, if more than 10 sales , then 250 $ bonus

public class SalaryCalculator {
    public static void main(String args[]) {
        int salary = 1000;
        int bonus = 250;
        int sales = 10;
        System.out.println("Enter the number of sales agent made :");
        Scanner scanner = new Scanner(System.in);
        int numberOfSales = scanner.nextInt();
        scanner.close();
        if (numberOfSales > sales) {
            salary += bonus;
        }
        System.out.println("The salary of the employee is : $" + salary);

    }
}
