class Butterfly
{
  public static void main(String args[])
  {
	  int rows=10;
	  for(int i=0;i<rows;i++)
	   {
		   for(int j=0;j<rows;j++)
		   {
			  if( i==j || j==rows-i-1 || j==0 || j==rows-1)
			  {
				  System.out.print("*");
		   } 
		   else
		   {
			   System.out.print(" ");
		   }
	   }
	    System.out.println();
  }
}
}
