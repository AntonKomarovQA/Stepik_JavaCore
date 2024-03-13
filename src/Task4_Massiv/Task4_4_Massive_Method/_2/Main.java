package Task4_Massiv.Task4_4_Massive_Method._2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        printMaxIndex(mas);
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

    //Выводит индекс первого максимального элемента для каждый строки
    private static void printMaxIndex(int[][] mas) {
        for (int i =0; i < mas.length; i++){
            for (int j = 0; j < mas[i].length; j++) {
            }
            System.out.print(findMax(mas[i])+" ");
        }

    }
    // поиск индекса первого максимального элемента в одномерном массиве
    public static int findMax(int[] ar) {

        int indMax = 0;
        for (int i =0; i<ar.length; i++){
            if (ar[i] > ar[indMax]){
                indMax = i;
            }
        }
        return indMax;
    }
}
