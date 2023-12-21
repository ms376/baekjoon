package chap4_array;

import java.util.Scanner;

public class Main1
{

	public static void main(String[] args)
	{
		//배열을 정의하고,횟수를받아서 if, 배열에 추가, 그리고 찾
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		String[] arr;
		arr = new String[a];
		for (int i = 0; i < a; i++) {
			String b = sc.next();
			arr[i]=b;
		}
		String c = sc.next();
		int d=0;
		for (String abc :arr) {
			if (abc.equals(c)) {
				d++;
			}
		}
		System.out.println(d);
		sc.close();
	}

}
