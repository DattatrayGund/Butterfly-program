class Simplechar 
{
	public static void main(String args[])
	{
 /*	char [] a={'A','B','C','D','E','F','G','H','I','J','H','K','L','M','N','O',
	             'P','Q','R','S','T','U','V','X','Y','Z'};
				 
		for(char i:a)
		{
		  System.out.println(i);
		}
		*/
	/*	char [] arr=new char[26];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)('a'+i);
	}	
      // explicity int to char	
	 // for(char ans:arr)
	{
		//System.out.println(ans);
		// anthore way 
		System.out.println(arr);
	}
	*/
	
	  int count=0;
	  char [] arr= new char[27];
	  for(char a='A';a<='z';a++)
	  {
		  arr[count]=a;
		  count++;
	  }
	  for(char ans : arr)
		  
		  {
			  System.out.println(ans);
		  }
	}
}