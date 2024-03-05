package Task4_Massiv.Task4_1_OneMassiv._2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        System.out.println("Введите начальное значение генератора случайных чисел:");
        int beg = scanner.nextInt(); // начальное с генерированное число


        Random random = new Random(beg);


        double[] mas = new double[n]; // создаю массив с кол-вом переменных
        // запись переменных в масив
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextDouble()*5;
            System.out.printf("%.2f ", mas[i]);
        }
        System.out.println();

        //нахождение среднего числа.
        double sred = 0;
        for (int i = 0; i < mas.length; i++) {
            sred +=mas[i];
        }
        double itog = sred/n;
        System.out.printf("%.2f", itog);
        System.out.println();

        //
        for (int i = 0; i < mas.length; i++) {
        if ( mas[i] > itog ){
            mas[i] = itog;
        }
        System.out.printf("%.2f ", mas[i]);
    }
    }
}