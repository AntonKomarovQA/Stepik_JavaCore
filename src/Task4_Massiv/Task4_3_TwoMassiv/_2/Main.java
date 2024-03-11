package Task4_Massiv.Task4_3_TwoMassiv._2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stroca = scanner.nextInt();
        int colon = scanner.nextInt();
        int [][] array = new int[stroca][colon];
        Random random = new Random(scanner.nextInt());
        double a = 0;
        int max = Integer.MIN_VALUE;
        int coun = 0;
        // Генерация двумерного массива с заполнением случайных чисел
        for (int i =0 ; i<array.length; i++){
            for(int j =0; j<array[i].length;j++){
                array[i][j] = random.nextInt(-10,11);
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println();
        }
        System.out.println();
        // Вычисление суммы положительных элементов для каждого столбца
        int [] sum = new int[colon];
        for ( int j = 0; j< colon;j++ ){
            for(int i =0 ; i< stroca; i ++){
                if(array[i][j]>0){
                    sum[j] += array[i][j];
                }
            }
        }
        // Вывод суммы положительных элементов для каждого столбца
        for( int i =0 ; i<colon; i++ ){
        System.out.print(sum[i]+" ");
    }
    }
}
