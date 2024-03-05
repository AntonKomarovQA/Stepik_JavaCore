package Task3_Method._3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printDivider(number);
    }

    private static void printDivider(int number) {

        // Проверка на натуральное число
        if (number<=0){
            System.out.println("Erorr");
            return;
        }
        // Вывод всех делителей натурального числа
        for (int i =1; i<=number;i++){
            if (number % i ==0){
                System.out.print(i+ " ");
            }
        }
    }
}
