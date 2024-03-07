package Task4_Massiv.Task4_2_Array._2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        System.out.println("Введите начальное значение случайных чисел:");

        double beg = scanner.nextInt();
        Random random = new Random((long) beg);

        double [] mas = new double[size];

        for (int i =0; i < mas.length; i++) {
            mas[i] = random.nextDouble(0, 2);
            //System.out.print(mas[i]+ " ");
        }

        System.out.println(Arrays.toString(mas));

        double max = Arrays.stream(mas).max().getAsDouble();
        double min = Arrays.stream(mas).min().getAsDouble();

        double sum = max + min;
        System.out.println(sum);

    }
}
