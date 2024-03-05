package Task4_Massiv.Task4_1_OneMassiv._4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива:");
        int n = sc.nextInt();
        System.out.println("Введите начальное значение случайных чисел:");
        int beg = sc.nextInt();

        int[] mas = new int[n];
        random.setSeed(beg);

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(-5, 16);
            System.out.print(mas[i] + " ");
        }

        // Максимальный Индекс
        int maxIndex = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > mas[maxIndex]) {
                maxIndex = i;
                break;
            }
        }
        // Минимальный Индекс
        int minIndex = -1;
        for (int i = mas.length - 1; i >= 0; i--) {
            if (mas[i] < 0) {
                minIndex = i;
                break;
            }
        }
            // Обмен местами, если есть отрицательный элемент
            if (minIndex != -1) {
                int tem = mas[maxIndex];
                mas[maxIndex] = mas[minIndex];
                mas[minIndex] = tem;
            }

            System.out.println();
            for (int el : mas) {
                System.out.print(el + " ");
            }

        }
    }