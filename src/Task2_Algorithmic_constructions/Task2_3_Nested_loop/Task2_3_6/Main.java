package Task2_Algorithmic_constructions.Task2_3_Nested_loop.Task2_3_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();


        for (int i =  1; i <= k; i++) {
            for (int j =  1; j <=  k; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }
}