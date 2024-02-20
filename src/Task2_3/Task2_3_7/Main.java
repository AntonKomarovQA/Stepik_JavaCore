package Task2_3.Task2_3_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();


        // Перестановка чисел местами, если первое число больше второго
        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }

        int maxSum =  0;
        int numberWithMaxSum =  0;

        // Поиск числа с максимальной суммой цифр в заданном отрезке
        for (int i = first; i <= second; i++) {
            int sum = sumOfDigits(Math.abs(i));
            if (sum > maxSum) {
                maxSum = sum;
                numberWithMaxSum = i;
            }
        }
        System.out.println("Число с максимальной суммой цифр: " + numberWithMaxSum);
    }

    // Функция для подсчета суммы цифр числа
    public static int sumOfDigits(int number) {
        int sum =  0;
        while (number !=  0) {
            sum = sum + Math.abs(number % 10);
            number = number / 10;
        }
        return sum;
    }
}