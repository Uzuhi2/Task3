import java.io.PrintStream;
import java.util.Scanner;

public class Task10 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		boxSeq(a, b, c);
	}
	public static void boxSeq(int a, int b, int c) 
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		if((int)Math.pow(c, 2) > ((int)Math.pow(a, 2) + (int)Math.pow(b, 2)))
			ps.print("Тупоугольный");
		else if((int)Math.pow(c, 2) == ((int)Math.pow(a, 2) + (int)Math.pow(b, 2)))
			ps.print("Прямоугольный");
		else
			ps.print("Остроугольный");
	}
}
