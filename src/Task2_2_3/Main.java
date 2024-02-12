package Task2_2_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


         Scanner scanner = new Scanner(System.in);

        String day = scanner.next();


        switch(day) {
            case "1", "2", "3", "4", "5":
                System.out.println("Working day");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            case "7":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");
        }
        }
}