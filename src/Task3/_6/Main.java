package Task3._6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Chislo = scanner.nextInt();

        switch (Chislo) {
            case 1:
                double a = scanner.nextDouble();
                square(a);
                break;
            case 2:
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                square(b,c);
                break;
            default:
                break;
        }

    }
    // Площадь прямоугольника
    static void  square(double a, double b ){
        System.out.println( a*b );
    }
    // Площадь Квадрата
    static void square(double c){
        System.out.println( c*c );
    }
}
