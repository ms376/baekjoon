package chap3_loop;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int a = 1; a < 10; a++) {
			System.out.printf("%d * %d = %d\n",num,a,num*a);
		}
		sc.close();
	}
}
