class halfbutterfly
{
 public static void main(String args[])
 {
	  int rows=5;
	  for(int i=0;i<rows;i++)
	   {
		   for(int j=0;j<rows;j++)
		   {
			  if( i==j || j==i || j==0 || j==5)
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