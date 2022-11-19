import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		String str = s.nextLine();
		ps.printf(asAvgWhole(str));
		//ps.printf(str.substring(0, 1));
	}
	public static String asAvgWhole(String a) {
		if (a.length() < 2)
			return "Несовместимо";
		if (a.charAt(0) == a.charAt(a.length()-1))
			return "Два - это пара";
		String c = a.substring(a.length()-1) + a.substring(1, a.length()-1) + a.substring(0, 1); 
		return c;
		
	}
}
