package Task4_Massiv.Task4_1_OneMassiv._1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        System.out.println("Введите начальное значение генератора случайных чисел:" );
        int beg = scanner.nextInt(); // начальное с генерированное число


        //
        Random random = new Random(beg);
        int [] mas = new int[n]; // создаю массив с кол-вом переменных
        // запись переменных в масив
        for ( int i = 0; i < mas.length; i ++){
            mas[i] = random.nextInt(-5,6);
            System.out.print(mas[i] +" ");
        }
        System.out.println();

        int sumPol = 0 ;
        double sumOtr = 1;
        for (int i = 0 ; i <mas.length; i++){
            if (mas[i] > 0){
                sumPol += mas[i];
            }
            if (mas[i] < 0 ){
                sumOtr *= mas[i];
            }
        }
        System.out.println("Сумма положительных чисел " + sumPol);
        System.out.println("Произведение отрицательных элементов " + sumOtr);
    }
}
