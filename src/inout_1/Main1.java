package inout_1;

import java.util.Scanner;

public class Main1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int z = b/100;
		int y = (b/10)%10;
		int x = b%10;
		
		System.out.println(a*x);
		System.out.println(a*y);
		System.out.println(a*z);
		System.out.println(a*b);
		sc.close();
	}
}
