package Task2_2_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // Вводимое число
        int vanChislo = Math.abs(a);
        int positiv = 0; // счетчик  положительных делителей
        int sumOF = 0; // счетчик суммы чисел


        do{
            int digit = vanChislo%10;
            sumOF = sumOF+digit;
            vanChislo = vanChislo / 10;
            positiv++ ;
        } while (vanChislo>0);


        System.out.println(positiv + " " + sumOF  );
    }
}