package chap4_array;

import java.util.Scanner;

public class Main2
{

	public static void main(String[] args)
	{
		//배열을 정의하고,횟수를받아서 if, 배열에 추가, 그리고 찾
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int c = sc.nextInt();
		int[] arr;
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			int b = sc.nextInt();
			arr[i]=b;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<c) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
