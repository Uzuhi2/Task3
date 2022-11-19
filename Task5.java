import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		String str = s.nextLine();
		if (asAvgWhole(str))
			ps.print("true");
		else
			ps.print("false");
	}
	public static boolean asAvgWhole(String a) {
		//char[] letters = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', '0'};
		//ArrayList<Character> nameList = new ArrayList<>(Arrays.asList(letters));
		String s = "1234567890ABCDEF";
		if (a.charAt(0) != '#')
			return false;
		if (a.length() != 7)
			return false;
		for(int i = 1; i < a.length(); i++) {
			char a1 = a.charAt(i);
			if (s.indexOf(a1) == -1)
				return false;
		}
		return true;
		
	}
}
