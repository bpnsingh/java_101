package chapter4;

import java.util.Scanner;

public class GroceryCalculator {
    public static void main (String args[]) {
        System.out.println("Enter the number of items you want to buy:");
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();
        double total = 0;
        for (int i=0; i<numberOfItems;i++) {
            System.out.println("Enter the price of the item:");
            double price=scanner.nextDouble();
            total += price;

        }
        scanner.close();
        System.out.println("The total price of the items is: $"+total);
    }
}
