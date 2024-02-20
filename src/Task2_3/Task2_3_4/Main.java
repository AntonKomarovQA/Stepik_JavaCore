package Task2_3.Task2_3_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();

        if (height <= 0) {
            System.out.println("ERROR");
        }

        for (int i = height; i >= 1; i--) {
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}