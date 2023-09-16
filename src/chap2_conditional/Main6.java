package chap2_conditional;

import java.time.LocalTime;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        LocalTime q = LocalTime.of(a, b);
        LocalTime e = q.plusMinutes(c);
        
        // 시간 부분 추출
        int hour = e.getHour();
        int minute = e.getMinute();
        
        System.out.print(hour);
        System.out.print(" "+minute);
		
		sc.close();
		
	}

}
