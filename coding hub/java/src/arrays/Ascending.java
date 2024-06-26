package arrays;
import java.util.*;

public class Ascending
{

	public static void main(String[] args)
	{
		int arr[]=new int[50];
		Random r=new Random();
		for(int x=0;x<arr.length;x++)
		{
				arr[x]=r.nextInt(1,500);
		}
		
		 for(int temp:arr)
		  System.out.println(temp);
		  for(int x=0;x<=arr.length-2;x++)
		  {
			  for(int y=x+1;y<arr.length;y++)
			  { 
				if(arr[x]>arr[y])//for descending arr[x]<arr[y];
				{
					int temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			  }
		   }
		System.out.println("--------------------------------");
		for(int temp:arr)
		System.out.println(temp);
	}
}	


	


