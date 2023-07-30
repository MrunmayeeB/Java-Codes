import java.io.*;
import java.util.*;

	public class Palindrome
	{
		public static void main(String args[])
		{
			String a = "madam";
			
			for(int i=0;i<a.length();i++)
			{
				if(a.charAt(i) == a.charAt(a.length()-1))
				{
					System.out.println("Is palindrome");
					
				}
				else
				{
					System.out.println("Not palindrome");
					
				}
			}
				
			
		}
	}

