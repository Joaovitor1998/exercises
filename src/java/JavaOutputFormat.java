package java;

import java.util.Scanner;

public class JavaOutputFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String value1 = scanner.next();
            int value2 = scanner.nextInt();

            // %-15s --> String width of 15 (left)
            // %03d --> 3 digits with leading digits as zero
            System.out.printf("%-15s%03d%n", value1, value2);
        }
        System.out.println("================================");

        scanner.close();
    }

}
