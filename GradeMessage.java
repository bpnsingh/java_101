package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String message;
        System.out.println("Enter your grade:");
        String grade = scanner.next();
        switch(grade){
            case "A":
                message = "Excellent job !!";
                break;
            case "B":
                message = "Great job !!";
                break;
            case "C":
                message = "Good job !!";
                break;
            case "D":
                message = "can do better";
                break;
            case "F":
                message = "Oh, O can do better!!";
                break;
            default:
                message = "Err, enter valid  grades!";
                break;
                        }
        System.out.println(message);
    }
}
