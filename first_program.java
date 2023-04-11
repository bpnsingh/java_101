import java.lang.*;
import java.util.*;
public class first_program {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        int total_saving = scanner.nextInt();
        int exchange_amount = scanner.nextInt();
        int result = total_saving - exchange_amount;
        System.out.println(result);
    }
}
