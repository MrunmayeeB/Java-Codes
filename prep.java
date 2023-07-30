class prep
{
	public static void main(String args[])
	{
		int fe = 0 , se = 1;
		int n = 10;

		System.out.print(fe+" "+se+" ");
		for(int i=fe;i<=n;i++)
		{
			
			int te = fe+se;
			System.out.print(te+" ");
			fe=se;
			se=te;
		}

	}
}