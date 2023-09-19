package chap3_loop;

import java.util.Scanner;

public class Main5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = a / 4;
		for (int i = 0; i < b; i++)
		{
			System.out.print("long"+" ");
		}
		System.out.print("int");
		sc.close();
	}

}
