package java;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        boolean isOdd = n % 2 == 1;
        boolean isEven = n % 2 == 0;

        if (isOdd) {
            System.out.println("Weird");
        } else if (isEven && (n >= 2 && n <= 5)) {
            System.out.println("Not Weird");
        } else if (isEven && (n >= 6 && n <= 20)) {
            System.out.println("Weird");
        } else if (isEven && (n > 20)) {
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}