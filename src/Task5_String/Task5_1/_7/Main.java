package Task5_String.Task5_1._7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine(); // текст без пробелов в начале и середине предложения
        String controlTest = sc.nextLine(); //контрольное слово

        String word = text.replaceAll("\\s"+controlTest+"\\s",""); //удаляем конкретнок слово

        System.out.println(word.trim().replaceAll("\\s+"," "));
    }
}
