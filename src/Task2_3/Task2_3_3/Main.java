package Task2_3.Task2_3_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int width = scan.nextInt();

        if (width <=0 || height<=0){
            System.out.println("ERROR");
        }

        for (int i =0; i < height; i ++){
            for (int j =0; j< width; j++){
                if (i == 0 || i == height-1 || j== 0 || j == width-1 ){
                System.out.print("*");
                } else {
                System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}