package Task5_String.Task5_1._4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isGMailAddress(String str) {
        // Проверяем наличие символа '@' и соответствие домену 'gmail.com', а также уникальность символа '@'
        return str.contains("@") && str.endsWith("@gmail.com") && str.indexOf("@") == str.lastIndexOf("@");
    }
}

