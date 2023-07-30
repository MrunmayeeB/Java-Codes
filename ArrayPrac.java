// //merge two array and sort in ascending order
// import java.util.Arrays;

// class ArrayPrac
// {
// 	public static void main(String args[]){
// 		int arr1[]={5,10,4};
// 		int arr2[]={0,8,6,999};

// 		int mergedarr[]=new int[arr1.length+arr2.length];
		
// 		int indx1 = 0;
// 		int indx2 = 0;
// 		int indx3 = 0;

// 		while(indx1<arr1.length && indx2<arr2.length)
// 		{
// 			if(arr1[indx1]<arr2[indx2])
// 			{
// 				mergedarr[indx3++]=arr1[indx1++];
// 			}else 
// 			{
// 				mergedarr[indx3++]=arr2[indx2++];
// 			}
// 		}
// 		while(indx1 < arr1.length)
// 		{
// 			mergedarr[indx3++]=arr1[indx1++];
// 		}

// 		while(indx2 < arr2.length)
// 		{
// 			mergedarr[indx3++]=arr2[indx2++];
// 		}


// 		//Arrays.sort(mergedarr);
// 		//bubble sort

// 		for(int i=0;i<mergedarr.length;i++)
// 		{
// 			for(int j=i+1;j<mergedarr.length;j++)
// 			{
// 				if(mergedarr[j]<mergedarr[i])
// 				{
// 					int temp=mergedarr[i];
// 					mergedarr[i]=mergedarr[j];
// 					mergedarr[j]=temp;
// 				}
				
// 			}
// 		}

// 		for(int i=0;i<mergedarr.length;i++)
// 		{
// 			System.out.print(mergedarr[i] + " ");
// 		}
		
// 	}
// }



class ArrayPrac
{
	public static void main(String args[]){
		int arr1[]={5,10,4};
		int arr2[]={0,8,6,999};

		int mergedarr[]=new int[arr1.length+arr2.length];
		int i=0;
		for(i=0;i<arr1.length;i++)
		{
			mergedarr[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++)
		{
			mergedarr[i++]=arr2[j];
		}

		for( i=0;i<mergedarr.length;i++)
		{
			System.out.print(mergedarr[i]+" ");
		}

		 		//bubble sort

		for( i=0;i<mergedarr.length;i++)
		{
			for(int j=i+1;j<mergedarr.length;j++)
			{
				if(mergedarr[j]<mergedarr[i])
				{
					int temp=mergedarr[i];
					mergedarr[i]=mergedarr[j];
					mergedarr[j]=temp;
				}
				
			}
		}

		for(i=0;i<mergedarr.length;i++)
		{
			System.out.print(mergedarr[i] + " ");
		}

	}
}