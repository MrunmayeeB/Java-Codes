class RevStr{
	public static void main(String args[])
	{
		//method 1
		String str = "hello";
		String rev = "";

		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			rev = ch+rev;
		}
		System.out.println(rev);


		//method 2
		StringBuilder sb = new StringBuilder("hello");
		for(int i=0;i<sb.length()/2;i++)
		{
			int frontindx = i;
			int backindx = sb.length()-1-i;

			char front = sb.charAt(frontindx);
			char back = sb.charAt(backindx);

			sb.setCharAt(frontindx,back);
			sb.setCharAt(backindx,front);
		}
		System.out.println(sb);

		//method 3
		StringBuilder sb1 = new StringBuilder("hello");
		sb1.reverse();
		System.out.println(sb1);


	}
}