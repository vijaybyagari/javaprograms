package arrays;
import java.util.*;
public class Zero 
{

	public static void main(String[] args) 
	{
		int arr[]=new int[] {1,0,2,0,3,0,4,0};
		int b[]=new int[arr.length-1/2];
		int c[]=new int[arr.length-1/2];
		int a;
	    for( a=0;a<arr.length;a++)
		{
		   if(arr[a]!=0)
		  {
			   b[a]=arr[a];
			  System.out.print(b[a]+" ");
		  }
	    }
		  for( a=0;a<arr.length;a++)
		{
		   if(arr[a]==0)
		  {
			   c[a]=arr[a];
			  System.out.print(c[a]+" ");
			   
		 }
		  
	}
		
		
		
	}

}
