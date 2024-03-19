package Task5_String.Task5_1._3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);

    //запись текста с клавиатуры
    String one = sc.nextLine();
    String two = sc.nextLine();
    String three = sc.nextLine();


    String[] parts = one.split(";"); // Разбиваем строку на подстроки с использованием ';'
    String [] parts1 = two.split(";");
    String [] parts2 = three.split(";");


        if (parts.length >= 1 && parts1.length>=1 && parts2.length>=1 ) { // Проверяем, что в строке есть хотя бы две подстроки, разделенные ';'
        String wordBet = parts[1]; // Выбираем вторую подстроку (индекс 1)
        String wordBet1 = parts1[1]; // Выбираем вторую подстроку (индекс 1)
        String wordBet2 = parts2[1]; // Выбираем вторую подстроку (индекс 1)
        System.out.println(wordBet+wordBet1+wordBet2); // Выводим выбранное слово на консоль
    } else {
        System.out.println("Нет слова между символами");
    }
}
}
