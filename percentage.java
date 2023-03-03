class percentage 
{
   public static void main(String args[])
   {
	  String s[] =new String[2];
	   s[0]="Dattatray";
       s[1]="Rushi"; 	   
        //Stores the reverse of given string  
        String a = "";  
          
        // the string from last and add each character to variable a  
        for(int i = s[0].length()-1; i >= 0; i--)
		{  
            a = a+ s.charAt(i);  
        }  
          
        System.out.println("Original string: " + s);  
        //Displays the reverse of given string  
        System.out.println("Reverse of given string: " + a);  
    
	  }
}