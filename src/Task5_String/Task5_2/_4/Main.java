package Task5_String.Task5_2._4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] numbers = new int[text.length()]; // Предполагаем, что все символы в строке являются цифрами
        int count = 0;
        int sum = 0; // Переменная для хранения суммы чисел


        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                numbers[count++] = num;
                sum += num; // Добавляем число к сумме
            }
        }
        if (count==0) {
            System.out.println("ERROR");

        } else {
        // Вывод извлеченных цифр
            for (int i = 0; i < count; i++) {
                System.out.print(numbers[i]);
                if (i < count - 1) { // Не добавляем + после последней цифры
                    System.out.print("+");
                }
            }
            // Вывод суммы всех чисел
            System.out.println("=" + sum);
        }
    }
}
