package Task5_String.Task5_1._1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String one = sc.nextLine();
        String two = sc.nextLine();
        String three = sc.nextLine();
        //запись 3-ех строк в массив
        String [] mas = {one,two,three};

        // сортировка массива
        Arrays.sort(mas);

        // Вывод
        for (int i =0; i<mas.length;i++){
            System.out.println(mas[i]);
        }
    }
}
