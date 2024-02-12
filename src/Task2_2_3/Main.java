package Task2_2_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int StartChislo = scanner.nextInt();
        int min = scanner.nextInt();

        for ( int i = 1 ; i < StartChislo; i ++){
            int curNum = scanner.nextInt();
            if (curNum < min){
                min = curNum;
            }
        }
        System.out.println(min);
        }
}