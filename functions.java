import java.util.*;

class functions{
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a=0,b=1;

		System.out.print(a+" "+b+" ");
		if(n>1){
			for(int i=2 ; i<=n;i++)
			{
				int temp = a+b;
				System.out.print(temp+" ");
				a=b;
				b=temp;

			}
	}
		

	}
}