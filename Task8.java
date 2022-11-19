import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		Scanner s = new Scanner(System.in);
		String word1 = s.nextLine();
		int result = isPrefix(word1);
		for (int i = 0; i < result; i++)
			ps.print("0");
	}
	public static int isPrefix(String a) 
		throws java.io.UnsupportedEncodingException
	{
		int coun = 0;
		int maxcoun = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '1')
				coun = 0;
			else
				coun++;
			if (coun > maxcoun)
				maxcoun = coun;
		}
		return maxcoun;
	}
}
