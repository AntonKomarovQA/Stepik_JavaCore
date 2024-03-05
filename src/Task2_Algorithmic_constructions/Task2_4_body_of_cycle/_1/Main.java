package Task2_Algorithmic_constructions.Task2_4_body_of_cycle._1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // Проверка числа на простоту
        boolean b = true;

        if (a <= 1) {
            b = false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    b = false;
                    break;
                }
            }
        }
        // Вывод результата
        if (b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}