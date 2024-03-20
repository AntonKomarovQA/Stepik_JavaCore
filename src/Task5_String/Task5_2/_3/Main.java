package Task5_String.Task5_2._3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String str = primer(a, b);
        System.out.println(str);
    }

    private static String primer(int a, int b) {
        int sum = a + b;
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" + ");
        sb.append(b);
        sb.append(" = ");
        sb.append(sum);
        return sb.toString() ;
    }
}
