package chap3_loop;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = ((n*(n+1)/2));
		System.out.println(a);
		sc.close();
	}
}
