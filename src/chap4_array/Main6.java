package chap4_array;

import java.util.Scanner;

public class Main6
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int G = 0;
		int Ba[] = new int[N];
		
		 for(int i = 0; i < Ba.length; i++) {
	            Ba[i] = i + 1;                    
	        }
		for (int i = 0; i < M; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			G = Ba[a - 1];
			Ba[a - 1] = Ba[b - 1];
			Ba[b - 1] = G;
		}
		for (int c = 0; c < Ba.length; c++)
		{
			System.out.print(Ba[c] + " ");
		}
		sc.close();
	}

}
// 배열의수 = N
// 시도횟수 = M
