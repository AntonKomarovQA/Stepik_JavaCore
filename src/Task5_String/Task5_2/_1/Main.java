package Task5_String.Task5_2._1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] wordAr = text.split(" ");

        // // Преобразование слов, содержащих букву "z"
        for (int i = 0; i < wordAr.length; i++) {
            if (wordAr[i].contains("z")) {
                wordAr[i] = "ERROR";
            }
        }
        // Объединение слов обратно в предложение
        String upCase = String.join(" ", wordAr);

        System.out.println(upCase.trim().replaceAll("\\s+", " "));
    }
}
