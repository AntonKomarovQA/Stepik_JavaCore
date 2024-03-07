package Task4_Massiv.Task4_2_Array._3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        System.out.println("Введите начальное значение случайных чисел:");

        int beg = scanner.nextInt();
        Random random = new Random(beg);

        int [] mas = new int[size];

        for (int i =0; i < mas.length; i++) {
            mas[i] = random.nextInt(10, 21);
            //System.out.print(mas[i]+ " ");
        }
        System.out.println(Arrays.toString(mas));

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        Arrays.sort(mas,start,end+1);
        System.out.println(Arrays.toString(mas));

    }
}
