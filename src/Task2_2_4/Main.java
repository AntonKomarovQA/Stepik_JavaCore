package Task2_2_4;

import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int StartChislo = scanner.nextInt();

        int del = 0 ;  //если деление на Остаток =0

        for (int i = 1 ; i<= StartChislo; i ++){
            if (StartChislo % i ==0 ){
                del += i;
            }
        }
        System.out.println(del);
    }
}