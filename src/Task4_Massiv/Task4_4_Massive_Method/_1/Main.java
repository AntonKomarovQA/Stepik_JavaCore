package Task4_Massiv.Task4_4_Massive_Method._1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Ввод размер массива
        int[] ar = new int[scan.nextInt()];
        //Ввод начального значения случайного числа
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);

        int ind = findMax(ar);
        System.out.println(ind);
    }

    //заполнение массива случайными числами от -3 до 5
    private static void init(int[] ar, long seed) {
        Random random = new Random(seed);
        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(-3,6);
        }
    }

    // вывод массива на консоль в строку
    private static void print(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
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


