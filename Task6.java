import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		Scanner s = new Scanner(System.in);
		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		String pr = ")";
		while (true) {
			pr = s.nextLine();
			if (pr.equals(""))
                break;
			arr1.add(pr);
		}
		while (true) {
			pr = s.nextLine();
			if (pr.equals(""))
                break;
			arr2.add(pr);
		}
		if (fib(arr1, arr2))
			ps.print("true");
		else
			ps.print("false");
	}
	public static boolean fib(ArrayList<String> a, ArrayList<String> b)
		throws java.io.UnsupportedEncodingException
	{
		int F1 = 0; 
        int F2 = 0;
        for (int i = 0; i < a.size(); i++){
            for (int j = 0; j < a.size(); j++){
            	if ((a.get(i) == a.get(j))&&(i != j))
                    F1++;
            }
        }
        for (int i = 0; i < b.size(); i++){
            for (int j = 0; j < b.size(); j++){
                if (b.get(i) == b.get(j))
                    F2++;
            }
        }
        return((a.size() - F1) == (b.size() - F2));
    }
}
