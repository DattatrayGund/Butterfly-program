import java.util.Scanner;
class precentage1
{
 
       public static void main(String args[]) 
		{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students");
        int n = in.nextInt();
        
        String name[] = new String[n];
        int totalmarks[] = new int[n];
        int AllTotal = 0;
        
        for (int i = 0; i < n; i++) 
		{
             in.nextLine();
            System.out.print("Enter name of student " + (i+1) + ": ");
            name[i] = in.nextLine();
            System.out.print("Enter total marks of student " + (i+1) + ": ");
            totalmarks[i] = in.nextInt();
            AllTotal += totalmarks[i];
        }
        
        double avg = AllTotal / (double)n;
        System.out.println("Average = " + avg);
        
        for (int i = 0; i < n; i++)
			{
            System.out.println("percentage for " + name[i] + " = " 
            + (totalmarks[i] - avg));
        }
    }

}