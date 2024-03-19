package Task5_String.Task5_1._6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String one = sc.nextLine();
        String[] word = one.split(" "); //разделяем входную строку на слова с помощью пробела
        String maxWord = ""; //самоее длинное слово
        int maxIndex = 0;  //индекс слова макс длины

        for (String asd : word) {
            if (asd.length() > maxIndex) { //Если длина текущего слова больше maxIndex, обновляет
                maxIndex = asd.length();
                maxWord = asd;
            }
        }
        System.out.println(maxWord);

    }
}