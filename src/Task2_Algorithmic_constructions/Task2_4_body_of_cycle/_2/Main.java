package Task2_Algorithmic_constructions.Task2_4_body_of_cycle._2;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            // начало и конец границ
            int start = scan.nextInt();
            int end = scan.nextInt();

            System.out.println("Простые числа в заданном диапазоне:");

            for ( int i = start; i<= end; i++) {
                boolean isPrime = true;
                if (i <= 1) {
                    isPrime = false;
                } else {
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                // Вывод результата
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }

