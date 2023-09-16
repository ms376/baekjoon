package chap2_conditional;

import java.util.Scanner;

public class Main3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// 윤년 A
		int A = sc.nextInt();
		if ((A % 4 == 0) && (A % 100 != 0) || (A % 400 == 0))
		{
			System.out.println("1");
		} else
		{
			System.out.println("0");
		}
		sc.close();
	}
}
