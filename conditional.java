import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        int dishCode = 5;
        if (dishCode == 1)
            System.out.println("Masala Dos If");
        else if (dishCode == 2)
            System.out.println("Medhu Vada If");
        else if (dishCode == 3 || dishCode == 5)
            System.out.println("Biryani");
        else
            System.out.println("Invalid");

        switch (dishCode) {
            case 1 :
                System.out.println("Masala Dosa switch");
                break;
            case 2:
                System.out.println("Medhu vada");
                break;
            case 3: case 5:
                System.out.println("Briyani switch");
                break;

            default:
                System.out.println("Invalid");



        }

        }

    }
