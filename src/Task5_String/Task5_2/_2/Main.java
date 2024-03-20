package Task5_String.Task5_2._2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        // Разделение предложения на слова
        String[] wordAr = text.split(" ");

        // Создание нового массива слов
        String [] readran = new String[wordAr.length];
        readran[0] = wordAr[0]; //Первое слово остается без изменений
        StringBuilder readraner = new StringBuilder(wordAr[0]); // Первое слово добавляется StringBullder 2-e решение

        // Перестановка слов
        for ( int i =1; i< wordAr.length;i++){
            //Последняя буква предыдущего слова
            //char lastChar = readran[i-1].charAt(readran[i-1].length()-1);
            char lastChar1 = readraner.charAt(readraner.length()-1);
            // Находим слово, которое начинается с этой буквы
            for (int j =1; j< wordAr.length;j++){
                if (wordAr[j].charAt(0)==lastChar1){
                    //readran[i]=wordAr[j];
                    readraner.append(" ").append(wordAr[j]);
                    break;
                }
            }
        }
        System.out.println(readraner.toString());
        //String upCase = String.join(" ", readran);

        //System.out.println(upCase);
    }
}
