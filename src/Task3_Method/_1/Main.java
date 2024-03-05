package Task3_Method._1;


import java.util.Scanner;

class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                int number = scan.nextInt();
                System.out.print(isSimple(number) + " ");
            }
        }
        static boolean isSimple(int a ){
            boolean b = true;

            if (a <= 1) {
                b = false;
            } else {
                for (int i = 2; i <= Math.sqrt(a); i++) {
                    if (a % i == 0) {
                        b = false;
                    }
                }
            }
            return b ;
        }
    }

