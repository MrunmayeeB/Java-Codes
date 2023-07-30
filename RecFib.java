class RecFib{
	public static int fibonacci(int N)
	{
		if(N<=1)
		{
			return N;
		}

		
			N=fibonacci(N-1)+fibonacci(N-2);
			return N;
		

	
	}
	public static void main(String args[])
	{
		int n=10;
		for(int i=0;i<n;i++)
		{
			System.out.print(fibonacci(i)+" ");
		}
	}
}