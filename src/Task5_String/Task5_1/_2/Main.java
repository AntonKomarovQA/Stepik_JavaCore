package Task5_String.Task5_1._2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //запись текста с клавиатуры
        String one = sc.nextLine();
        // Замена символов
        String changes = one.replace(";",".,");

        System.out.println(changes);
    }
}
