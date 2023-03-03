import java.util.Scanner;
class Factorial
{
public static void main (String args[])
{
     int n;
	 System.out.println("enter the number");
     Scanner sc = new Scanner (System.in);
     n=sc.nextInt();
     int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.print("fact of number is:"+fact);
	}}

