package Task2_2_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // Вводимое число

        int positiv = 0; // счетчик  положительных делителей

        int Num; // последовательные числа
        do{
            Num = scanner.nextInt();
            if (Num > 0 && a % Num == 0){
                positiv++;
            }
        } while (Num>=0);
        System.out.println(positiv);

        }
}