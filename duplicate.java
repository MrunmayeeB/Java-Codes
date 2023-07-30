import java.util.*;

class Demo
    {
    public static void main(String args[])
        {
        	int arr[] = {1,2,3,2};
        	int newarr[] = new int[3];
        	int j=0;
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==arr[i+1])
					{
						break;
					}
				else 
				{
					newarr[i] = arr[j];
					j++;
				}
			}
			System.out.println();

		//output
		for(int i=0;i<newarr.length;i++)
		{
			System.out.print(newarr[i]+" ");
		}

        }
}