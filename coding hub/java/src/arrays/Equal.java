package arrays;
import java.util.*;
public class Equal
{

	public static void main(String[] args)
	{
		int arr[]=new int[] {11,45,34,21};
		int arrb[]=new int[]{11,45,34,21};
		int count=0;
		 for(int a=0;a<arr.length;a++)
		{
		  if(arr[a]==arrb[a])
		  {
			  count++;
		  }
		  if(count==arr.length)
			     System.out.println("two arrays are equal");
		  else
			  System.out.println("two arrays are not equal");
		  
		}
		 

	}

}
