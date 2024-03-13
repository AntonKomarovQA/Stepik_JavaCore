package Task4_Massiv.Task4_4_Massive_Method._3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        int[] b = reduceAfterMax(ar);
        print(b);
    }

    //инициализирует массив случайными числами от -3 до 5;
    private static void init(int[] ar, long seed) {
        Random random = new Random(seed);
        for (int i = 0; i < ar.length; i++) {
                ar[i] = random.nextInt(-3,6);
        }
    }

    // вывод массива на консоль
    private static void print(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
                System.out.print(ar[i] + " ");
            }
            System.out.println();
        }

    // поиск индекса первого максимального элемента в одномерном массиве
    public static int findMax(int[] ar) {

        int indMax = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > ar[indMax]) {
                indMax = i;
            }
        }
        return indMax;
    }

    //создает новый массив, удаляя все элементы после первого максимума
    private static int[] reduceAfterMax(int[] ar) {
        int lim = findMax(ar); // Предполагаем, что findMaxIndex возвращает индекс максимального элемента
        int [] res = new int[lim+1]; // Создаем новый массив с размером до первого максимального элемента (включительно)

        // Копируем элементы из исходного массива в новый до индекса первого максимального элемента
        for (int i = 0; i <= lim; i++) {
            res[i] = ar[i];
        }
        return res;
    }
}