package Task4_Massiv.Task4_3_TwoMassiv._3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stroca = scanner.nextInt();
        int colon = scanner.nextInt();
        int [][] array = new int[stroca][colon];
        Random random = new Random(scanner.nextInt());
        // Генерация двумерного массива с заполнением случайных чисел
        for (int i =0 ; i<array.length; i++){
            for(int j =0; j<array[i].length;j++){
                array[i][j] = random.nextInt(-10,11);
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println();
        }
        // Вычисление суммы положительных элементов для каждого столбца
            for(int i =0 ; i< stroca; i ++){
                boolean found = false;
                for ( int j = 0; j< colon;j++ ){
                    if ( array[i][j]<0 ){
                        System.out.println(j);
                        found = true;
                        break;
                    }
            }
                // Если в строке нет отрицательных чисел, выводим "NO"
                if (!found){
                    System.out.println("NO");
                }
        }
    }
}
