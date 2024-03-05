package Task3_Method._4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = maxNumberDivider(a, b);
        System.out.println(max);
    }

    // метод для нахождения числа с наибольшим колвом деталей в заданном диапазоне
    private static int maxNumberDivider(int a, int b) {

        int numberMost = a ;
        int maxDel = 0;

        for (int i =a; i <= b ; i ++){
            int dell = isDel(i);

            if (dell > maxDel){

                maxDel = dell;
                numberMost = i;
            }
        }

        return numberMost;
    }

    // Метод для подсчета кол-ва делителей числа
    private static int isDel(int number){
        int del = 0;

        for (int i =1; i<=number;i++){
            if (number % i ==0){
                del++;
            }
        }
        return del;
    }
}
