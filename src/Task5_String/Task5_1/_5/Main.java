package Task5_String.Task5_1._5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(delCom(str));
    }

    private static String delCom(String str) {
        if (str.endsWith(".com")){
         return str.substring(0,str.length()-4); //Удаляем последние 4 символа (".com")
        }
        return str; // Возвращаем строку, если строка не заканчивается на ".com"
    }
}
