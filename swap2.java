//swap the program using third varible

class swap2
{ 
  public static void main(String args[])
  {
	  int a=20;
	  int b=40;
	  int c;
	  
	 
	  //swap the program
	  //c=a;
	  //b=c;
	  //a=b
	  c=a+b;
	  a=c-a;
	  b=b-c;
	  System.out.println("after swap the program:"+a+ " "+b);
	  
}
}