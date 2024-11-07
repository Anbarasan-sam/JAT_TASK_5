package guviTask5;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 0; i < rows / 2 + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < rows - 2 * i - 2; j++) {
                System.out.print(" ");
            }
            if (i != rows / 2) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = rows / 2 - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
           
            System.out.print("*");
            for (int j = 0; j < rows - 2 * i - 2; j++) {
                System.out.print(" ");
            }
            if (i != rows / 2) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
