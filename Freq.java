class Freq{
	public static void main(String args[]){
		String str = "abaccd";
		char arr[] = str.toCharArray();

		int freq[] = new int[str.length()];

		for(int i=0;i<str.length();i++){
			freq[i]=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(arr[i]==arr[j])
				{
					freq[i]++;
					arr[j]='0';
				}
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(arr[i]!='0'){
				System.out.println(arr[i]+"="+freq[i]);
			}
			
			
		}
	}
}