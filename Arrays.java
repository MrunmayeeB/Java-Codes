import java.util.*;

class Arrays{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int fe=0;
		int se=1;

		for(int i=2;i<n;i++)
		{
			int temp=fe+se;
			System.out.print(temp);
			fe=se;
			se=temp;
			

			
		}

	}
}