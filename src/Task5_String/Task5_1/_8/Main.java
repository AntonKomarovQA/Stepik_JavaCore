package Task5_String.Task5_1._8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String one = scanner.nextLine();

        String [] word = one.split(" ");
        // Преобразование каждого слова в верхний регистр
        for (int i =0 ; i<word.length;i++){
            word[i] = word[i].substring(0,1).toUpperCase() + word[i].substring(1);
            }

        // Объединение слов обратно в предложение
        String upCase = String.join(" ",word);

        System.out.println(upCase);
        }
}
