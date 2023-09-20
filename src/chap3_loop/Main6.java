package chap3_loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main6
{
	public static void main(String[] args) throws IOException{
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(a.readLine());
		StringTokenizer c;
		for (int i = 0; i < A; i++)
		{
			c = new StringTokenizer(a.readLine(), " ");
			b.write((Integer.parseInt(c.nextToken()) + Integer.parseInt(c.nextToken()))+"\n");
			
		}
		a.close();
		b.flush();
		b.close();
	}
}
