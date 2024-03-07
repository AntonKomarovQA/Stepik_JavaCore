package Task4_Massiv.Task4_2_Array._1;

import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // создание массива
        int[] mas = {1, 2, -3, 4, 25, 6, 17, -1, 9, 6};
        String str = Arrays.toString(mas);
        System.out.println(str);
        // сортировка массива
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
        // создание массива из Строк и сортировка его
        String[] list = {"Kot", "Kotik", "May", "Booba"};
        Arrays.sort(list, Collections.reverseOrder());
        System.out.println(Arrays.toString(list));
        //sort является методом экземпляра класса поэтому для его вызова создается экземпляр класса
        Test main = new Test();
        main.sort(new Object[]{1, 2, -3, 4, 25, 6, 17, -1, 9, 6},3,8);

    }
    // сортировка части массива
    void sort(Object [] a , int startIndex , int endtIndex ){
        Arrays.sort(a,startIndex,endtIndex);
        System.out.println(Arrays.toString(a));

    }
}
