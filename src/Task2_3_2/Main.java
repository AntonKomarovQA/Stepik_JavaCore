package Task2_3_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();

        for (int i = width; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        }
    }
