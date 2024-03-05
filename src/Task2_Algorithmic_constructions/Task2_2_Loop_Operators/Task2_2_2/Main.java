package Task2_Algorithmic_constructions.Task2_2_Loop_Operators.Task2_2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int diapazomA = scan.nextInt();
        int diapazomB = scan.nextInt();


        double itog = 1;

        if (diapazomA > diapazomB) {
            int zamena = diapazomA;
            diapazomA = diapazomB;
            diapazomB = zamena;
        }

        int perStart = diapazomA;
            while (perStart <= diapazomB) {
                itog *= perStart;
                perStart++;
            }

        System.out.println(itog);
    }
}