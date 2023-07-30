class NumPattern
{
	public static void main(String args[])
	{	//1
		for(int i=3;i>0;i--)
		{
			for(int j=i*3;j>0;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}


		System.out.println();

		//2
		int cnt = 1;
		for(int i=3;i>=0;i--)
		{
			for(int j=3*i;j>0;j--)
			{
				System.out.print(cnt);
			}
			cnt++;
			System.out.println();
		}

	}
}