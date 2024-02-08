import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {


         Scanner scanner = new Scanner(System.in);

        double disAB = scanner.nextInt();
        double disBC = scanner.nextInt();
        double massa = scanner.nextInt();

        double itog =calk(disAB, disBC, massa);


        System.out.printf("%.2f",itog);


        }

    private static double calk(double disAB, double disBC, double massa){
        double min_rasxod_toplivo = 0;

        if (massa<= 500){
            min_rasxod_toplivo = 1;
        } else if ( massa <= 1000) {
            min_rasxod_toplivo = 4;
        }else if ( massa <= 1500) {
            min_rasxod_toplivo = 7;
        }else if ( massa <= 2000) {
            min_rasxod_toplivo = 9;
        }  else {
            System.out.println("ERROR");
            System.exit(1);
        }


        double fuelAB = disAB * min_rasxod_toplivo;
        double fuelBC = disBC * min_rasxod_toplivo;

        if (fuelAB>300){
            System.out.println("ERROR");
            System.exit(1);
        } else if (fuelBC>300){
            System.out.println("ERROR");
            System.exit(1);
        }

        double itog = fuelAB + fuelBC - 300;

        if (itog<0){
            System.out.println("0.00");
            System.exit(1);
        }

        return itog;
    }
}