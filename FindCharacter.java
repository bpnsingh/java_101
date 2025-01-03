package chapter4;

import java.util.Scanner;

public class FindCharacter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word");

        String inputWord = scanner.next();
        char searchChar = 'c';
        boolean charFound = false;
        for (int i = 0; i < inputWord.length(); i++) {
            if (inputWord.charAt(i) == searchChar ) {
                charFound = true;
                break;
            }
        }
        if (charFound) {
            System.out.println("The character " + searchChar + " is found in the word " + inputWord);
        } else {
            System.out.println("The character " + searchChar + " is not found in the word " + inputWord);
        }

    }
}
