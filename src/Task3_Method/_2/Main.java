package Task3_Method._2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int kol = simpleInRange(a, b);
        System.out.println(kol);
    }

    // Метод для подсчета количества простых чисел в заданном диапазоне
    private static int simpleInRange(int a, int b) {

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        int count = 0;

        for (int i = a; i <= b; i++) {
            if (isSimple(i)) {
                count++;
            }
        }

        return count;
    }

    // Метод для проверки, является ли число простым
    static boolean isSimple(int number ){

        if (number <= 1) {
            return false;
        }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return  false;
                }
            }
        return true ;
    }
}
