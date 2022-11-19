import java.io.PrintStream;
import java.util.Scanner;
//import 

public class Task1 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		ps.print(solutions(a, b, c));
	}
	public static int solutions(int a, int b, int c) 
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		double d = (Math.pow(b, 2)) - (4*a*c);
		if (d == 0)
			return 1;
		else if (d < 0)
			return 0;
		return 2;
	}
}
