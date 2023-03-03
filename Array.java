//Array :- Indexed collection of homogenies data type
//contigius memory location
//insertion,delection not allowed.
//random access
//code optimize
//sqeuer bracket  uesd as notation
//fixed size at the time of declertion

class Array
{ 
  public static void main(String agrs[])
  {
    int[]a=new int[7];
	a[0]=10;
	a[2]=20;
	a[5]=30;
	a[4]=40;
	a[3]=50;
	a[1]=123;
   
    for(int i=5;i<=7;i++)
	{
		System.out.println(a[i]);
	}   
 }
}

/*	int max = a[0];  
        //Loop through the array  
        for (int i = 0; i < a.length; i++) 
		{  
            //Compare elements of array with max  
           if(a[i] > max)  
               max = a[i];  
        }  
        System.out.println("Largest element present in given array: " + max);
	*/
	
	/*  int min = a[0];  
        //Loop through the array  
        for (int i = 0; i < a.length; i--) 
		{  
            //Compare elements of array with min 
           if(a[i] > min)  
               min = a[i];  
        }  
        System.out.println("smallest  element  in given array: " + min);
	*/
/*	int total = a[0];
	//loop through the array
	
	for(int i=0; i<a.length;i++)
	{
	  if(a[i] + total)
		  total = a[i];
	}
	  System.out.println("total element in array:"+total);
	}
} */

