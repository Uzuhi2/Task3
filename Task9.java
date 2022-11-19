import java.io.PrintStream;
import java.util.Scanner;
import java.util.Scanner;

public class Task9 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		ps.print(nextPrime(num));
	}
	public static int nextPrime(int a){
        //for (int i = 2; i < a; i++) {
        	
       // }
		for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                a++;
                i = 2;
            }
		}
        return a;
	}
}
