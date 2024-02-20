package Task2_3.Task2_3_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double  k = 0, sum = 0;
        double grade;
        double sred;
        grade = scan.nextInt();
        while (grade >= 0) {
            sum += grade;
            k++;
            grade = scan.nextInt();
        }
        if (k > 0) {
            sred = sum / k;
            System.out.printf("%.1f",sred);
        } else {
            System.out.println("No data");
        }
    }
}

