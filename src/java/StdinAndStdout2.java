package java;

import java.util.Scanner;

public class StdinAndStdout2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstLine = scanner.nextInt();
        double secondLine = scanner.nextDouble();
        scanner.nextLine();
        String thirdLine = scanner.nextLine();

        System.out.println("String: " + thirdLine);
        System.out.println("Double: " + secondLine);
        System.out.println("Int: " + firstLine);

        scanner.close();
    }

}
