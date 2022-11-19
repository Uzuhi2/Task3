import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		ps.print(repeat(word));
	}
	public static int repeat(String a) 
		throws java.io.UnsupportedEncodingException
	{
		int n = 0;
		for (int i = 0; i < (a.length()-2); i++) {
			if ((a.charAt(i) == 'z') && (a.charAt(i+1) == 'i') && (a.charAt(i+2) == 'p')) 
				n++;
			if (n == 2)
				return i;
		}
		return -1;
	}
}
