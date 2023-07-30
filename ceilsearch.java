class ceilSearch{

	public static void main (String[] args)
    {
       int arr[] = {1, 2, 8, 10, 10, 12, 19};
       int n = arr.length;
       int x = 20;
       // int x = 1;
       // int x = 5;
       // int x = 20;
       int index = ceilSearch(arr,x);
       
       if(index == -1 )
         System.out.println("Ceiling of "+x+" doesn't exist in array");
       else
         System.out.println("ceiling of "+x+" is "+arr[index]);	
		
	}
	static int ceilSearch(int arr[], int x){
		 int i = 0 ;
        
        int n = arr.length;
        while( i < n )
        {
        	
        	if(arr[i] == x)
        	{
        		return i;
        	}
            if(arr[i] > x)
            {
                break;
            }
            
            i++;
        }
        if(i==n)
        {
            return -1;
        }
        
        return i;
	}

}