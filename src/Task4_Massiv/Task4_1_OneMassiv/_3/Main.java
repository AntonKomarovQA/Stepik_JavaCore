package Task4_Massiv.Task4_1_OneMassiv._3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //
        System.out.println("Введите  кол-во элементов массива:");
        int n = scanner.nextInt();
        System.out.println("Введите  сами элементы:");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println();

        // нахождение минимального индекса
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[minIndex]) {
                minIndex = i;
            }
        }

        array[minIndex] = -1;
        for (int el : array) {
            System.out.print(el + " ");
        }
    }
}