package Task4_Massiv.Task4_4_Massive_Method._4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        int ind = scan.nextInt();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        mas = deleteRow(mas, ind);
        printArray(mas);
    }


    //инициализирует двумерный массив случайными числами от 0 до 10;
    private static void initArray(int[][] mas, long seed) {
        Random random = new Random(seed);
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(11);
            }
        }
    }

    //выводит двумерный массив на консоль в виде таблицы;
    private static void printArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //создает новый двумерный массив
    private static int[][] deleteRow(int[][] mas, int ind) {
        if (ind < 0 || ind >= mas.length){
            return mas ;
        }

        int [][] b = new int[mas.length-1][mas[0].length]; // Создаем новый массив с размером, уменьшенным на одну строку
        // Копируем все строки, кроме той, индекс которой равен ind
        for (int i = 0; i < mas.length; i++) {
            if (i < ind) {
                b[i] = mas[i];
            } else if (i > ind) {
                b[i - 1] = mas[i];
            }
        }
        return b;
    }

}
