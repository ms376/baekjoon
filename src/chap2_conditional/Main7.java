package chap2_conditional;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result;

        if (a == b && b == c) {
            result = a * 1000 + 10000;
        } else if (a == b || a == c) {
            result = a * 100 + 1000;
        } else if (b == c) {
            result = b * 100 + 1000;
        } else {
            result = Math.max(Math.max(a, b), c) * 100;
        }

        System.out.println(result);
        sc.close();
    }
}

