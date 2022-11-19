import java.io.PrintStream;
import java.util.Scanner;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Scanner;

public class Task7 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if (isStrange(num))
			ps.print("true");
		else
			ps.print("false");
	}
	public static boolean isStrange(int a) 
		throws java.io.UnsupportedEncodingException
	{
		if (a == 1 || a == 0)
			return true;
		if (a < 4)
			return false;
		int number = (int)Math.pow(a, 2);
		String num = Integer.toString(number);
		//int sum = 0;
		//ps.println((num.length())/2);
		String first = num.substring(0, (num.length())/2);
		String second = num.substring((num.length())/2, num.length());
		int sum = Integer.parseInt(first) + Integer.parseInt(second);
		/*for (int i = 0; i < num.length(); i++) {
			sum += Character.getNumericValue(num.charAt(i));
		}*/
		if (sum == a)
			return true;
		return false;
	}
}
