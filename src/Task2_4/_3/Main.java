package Task2_4._3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // начало и конец границ
        int start = scan.nextInt();
        int end = scan.nextInt();

        if (start>end){
            int temp = start;
            start = end;
            end = temp;
        }

        // Поиск первого составного числа в заданном диапазоне

        for ( int i = start; i<= end; i++) {
            boolean isPrime = false;

            if (i > 1) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = true;
                        break;
                    }
                }
            }
            // Вывод результата
            if (isPrime) {
                System.out.print("Первое число " + i);
                return;
            }
        }

        System.out.println("NO");
    }
}
