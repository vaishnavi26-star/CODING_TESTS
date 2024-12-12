package coding_tests;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();

 
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

     
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }
}
