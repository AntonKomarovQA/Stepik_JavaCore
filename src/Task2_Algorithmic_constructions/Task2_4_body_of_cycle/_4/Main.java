package Task2_Algorithmic_constructions.Task2_4_body_of_cycle._4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // ввод числа
        int start = scan.nextInt();



        // Нахождение суммы четных делителей
        int sum = 0 ;

        for ( int i = 1; i<= start/2; i++) {
            if (start % i == 0 && i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
