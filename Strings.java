import java.util.*;

class Strings
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		String str=sc.next();

		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);		

		String rev ="";

		System.out.println(sb.reverse());
	}
}