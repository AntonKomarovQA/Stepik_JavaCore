package Task2_4._5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // ввод числа
        int start = scan.nextInt();
        int end = scan.nextInt();


        // Нахождение суммы наименьших делителей всех чисел в заданном диапазоне
        int sum = 0;

        for (int i = start; i <= end; i++) {
            int small = i;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    small = j;
                    break;
                }
            }
            sum = sum + small;
        }
        System.out.println(sum);
    }
}