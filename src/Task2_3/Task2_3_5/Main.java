package Task2_3.Task2_3_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();

        if (width <= 0) {
            System.out.println("ERROR");
        }


        for (int i = 0; i < width; i+=2) {

            for (int j = 0; j < i /2 ; j++) {
                System.out.print(" ");
            }
            for (int k = width-i; k >0 ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}