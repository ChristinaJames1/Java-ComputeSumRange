// The following code will request a beginning & end range from the user,
//all numbers with the given range will be added and sum returned.

import java.util.Scanner;

public class JavaChallenge {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Request number range from user
        System.out.print("Enter the start number for the range you would like to add: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end number for the range you would like to add: ");
        int end = scanner.nextInt();

        int sum = 0;

        // Sum all numbers in the given range
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("The sum of all digits from " + start + " to " + end + " is " + sum);

        scanner.close();
    }
}