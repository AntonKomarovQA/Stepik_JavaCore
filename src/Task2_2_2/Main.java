package Task2_2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        final int N = 10;
        int mark, kol = 0;//kol - счетчик введенных оценок
        int chetMin = 0;

        while (kol < N) {
            mark = scan.nextInt(); //вводим оценку

            if (mark < 4) {
                chetMin++;
            }
            kol++;
        }
        System.out.println(chetMin);
        //вывод с одним знаком после точки
    }
}