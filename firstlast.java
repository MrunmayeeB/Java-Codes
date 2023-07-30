class firstlast{
	public static void main(String args[]){
		String str = "abaacdaefaab";
		int first = -1;
		int last = -1;
		int count = 0;

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='b')
			{
				 count++;
            	if (count  == 1) //this will be 1 for only first position
            	{
					first = i;
					System.out.println(first);
				}
				else // when count is more than 1, store the value in last..repeat till end of string
				{
					last = i;
				}
			}
			
		}

		System.out.println(last);
	}
}