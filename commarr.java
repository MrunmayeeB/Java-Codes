class commarr{
	public static void main(String args[]){
		int arr1[] = {1,2,3,4};
		int arr2[] = {4,5,6,3,8};
		int arr3[] = {4,9,0,2,3};

		int n1 = arr1.length;
		int n2 = arr2.length;
		int n3 = arr3.length;

		for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                for(int k=0;k<n3;k++)
                {
                    if(arr1[i]==arr2[j] && arr1[i]==arr3[k])
                    {
                       System.out.print(arr1[i]+" ");
                    }
                }
            }
        }
	}
}