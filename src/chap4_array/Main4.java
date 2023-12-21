package chap4_array;

import java.util.Scanner;

public class Main4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int co=0;
		int max = 0;
		int count = 0;

		for (int ar : arr)
		{
			co++;
			if (ar > max)
			{
				max = ar;
				count = co;
			}
		}
		System.out.println(max+"\n"+count);
		sc.close();
	}
}
