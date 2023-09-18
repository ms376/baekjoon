package chap3_loop;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long total = sc.nextLong(); // X
        long totalsum =0;
        int count = sc.nextInt(); // N
        for (int i = 0; i < count; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			long sum = a*b;
			
			totalsum+= sum;
		}
        if (totalsum == total)
		{
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
        sc.close();
    }
}