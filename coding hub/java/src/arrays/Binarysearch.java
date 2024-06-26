package arrays;
import java.util.Arrays;

public class Binarysearch
{
   public static void main(String[] args) 
	{
	  int arr[]=new int[] {7,89,21,56,32,77,24,90};
	  Arrays.sort(arr);//to sort an array 
	  for(int temp:arr)
	  System.out.println(temp);
	  int first=0,last=arr.length-1,mid=0,search=90,count=0;
	  while(first<=last)
	  {
		 mid=(first+last)/2;
		 count++;
		 if(arr[mid]<search)
		 first=mid+1;
		 else if(arr[mid]==search)
		 {
	     System.out.println("ELEMENT FOUND  "+mid);
	     break;
		 }
		 else
		 last=mid-1;
		}
	   if(first>last)
		  System.out.println("element not found");
	   System.out.println("no of iteration "+count); 
	 }
      

}
