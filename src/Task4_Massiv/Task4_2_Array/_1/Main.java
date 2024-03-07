package Task4_Massiv.Task4_2_Array._1;


import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
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
            mas[i] = random.nextInt(2, 16);
            //System.out.print(mas[i]+ " ");
        }

        System.out.println("Контрольное число:");

        int contrIn = scanner.nextInt();

        //сортировка массива
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));


        //Поиск элемента
        int ind = Arrays.binarySearch(mas,contrIn);
        if (ind >= 0){
            System.out.println(ind);
            int [] c = Arrays.copyOf(mas,ind+1);
            System.out.println(Arrays.toString(c));
        }
        else {
            System.out.println("ERROR");
        }
    }
}