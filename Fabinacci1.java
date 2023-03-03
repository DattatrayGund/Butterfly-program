import java.util.Scanner;
class Fibonacci1
{
public static void main (String args[])
{
int n, n1=0,n2=0, n3=1;
System.out.println("Enter the number:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("fibnaccil series:");

for(int i=1;i<=n;i++)
{
 	n1=n2;
	n2=n3;
	n3=n1+n2;
}
 System.out.print(n1+" ");
}
}


