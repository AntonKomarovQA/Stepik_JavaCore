package Task3_Method._5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод пользователем ширины треугольника и символа
        int width = scanner.nextInt();
        char symbol = scanner.next().charAt(0);

        // Вызов метода printTriangle() с введенными параметрами
        printTriangle(width, symbol);
    }

    // Метод для вывода треугольника на консоль
    public static void printTriangle(int width, char symbol) {

        // Вывод треугольника
        for (int i = (width - 1) / 2; i >= 0; i--) {
            // Вывод пробелов перед символами
            for (int j = i; j > 0 ; j--) {
                System.out.print(" ");
            }
            // Вывод символов
            for (int k = 1; k <= width - 2 * i ; k++) {
                System.out.print(symbol);
            }
            System.out.println(); // Переход на новую строку после каждой строки треугольника
        }
    }
}