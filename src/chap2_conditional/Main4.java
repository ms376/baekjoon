package chap2_conditional;

import java.util.Scanner;

public class Main4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// a는 x좌표 b는 y좌표
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a>0 && b>0)
		{
			System.out.println("1");
		}else if(a>0 && b<0){
			System.out.println("4");
		}else if(a<0 && b>0){
			System.out.println("2");
		}else {
			System.out.println("3");
		}
	}
}
