import java.util.*;

class arrinsert
{
	public static void main(String args[])
	{
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter size:");
		//int size = sc.nextInt();

		int arr[] = {1,2,3};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

		int newarr[] = new int[4];
		int index = 2;
		int j=0;
		for(int i=0;i<newarr.length;i++)
		{
			if(i==index)
			{
				newarr[i]=4;
			}
			else 
			{
				newarr[i]=arr[j];
				j++;
			}
		}
		System.out.println();

		//output
		for(int i=0;i<newarr.length;i++)
		{
			System.out.print(newarr[i]+" ");
		}

		
		System.out.println();

	}
}

