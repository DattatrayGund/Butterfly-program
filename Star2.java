   *  
   * *
   *  *
   *   *
   ******
class Star2
{
  public static void main(String args[])
  {
	  int row=5;
  	  for(int i=0;i<=row;i++)
	  {
		  for(int j=0;j<i;j++)
		  {
			  if((j==0) || (i==5) ||(i==j))
			  {
			  System.out.print("*");
		  }
		  else
		  { 
		  System.out.print(" ");
		  }
	  }
	   System.out.println("*");
      }
       for(int i=0;i<=row;i++)
	  {
		  for(int j=i;j<row;j++)
		  {
			  if((j==0) || (i==5) ||(i==j))
			  {
			  System.out.print("*");
		  }
		  else
		  { 
		  System.out.print(" ");
		  }
	  }
	   System.out.println("*");
  }
  
      
}
}