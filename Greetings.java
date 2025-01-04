package chapter5;
import java.util.Scanner;
public class Greetings {
    public static void main(String args[]) {
        System.out.println("Enter Your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        greetUser(name);

    }
    public static void greetUser(String name) {
        System.out.println("Hello there " + name + "!");
    }
}
