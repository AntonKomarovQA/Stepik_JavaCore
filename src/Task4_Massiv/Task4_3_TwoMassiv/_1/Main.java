package Task4_Massiv.Task4_3_TwoMassiv._1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] array = new int[scanner.nextInt()][scanner.nextInt()];
        Random random = new Random(scanner.nextInt());
        double a = 0;
        int max = Integer.MIN_VALUE;
        int coun = 0;
        // Генерация двумерного массива с заполнением случайных чисел
        for (int i =0 ; i<array.length; i++){
            for(int j =0; j<array[i].length;j++){
                array[i][j] = random.nextInt(-5,5);
                System.out.print(array[i][j]+ "\t");
                /*if (array[i][j]>max){
                    max = array[i][j];
                    coun = 1;
                } else if (array[i][j]==max){
                    coun++;
                }*/
            }
            System.out.println();
        }
        //System.out.println(max+" "+ coun);
        // поиск максимального значения
        for ( int [] i : array) {
            for (int j : i) {
                if (j > max) {
                    max = j;
                    coun = 1; // Начинаем считать снова, если нашли новый максимум
                } else if (j == max) {
                    coun++;
                }
            }
        }
        System.out.println(max+" "+ coun);

    }
}
