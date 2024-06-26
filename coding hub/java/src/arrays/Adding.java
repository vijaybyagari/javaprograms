package arrays;
import java.util.*;
public class Adding 
{

	public static void main(String[] args) 
	{
		int a[]=new int[]{10,20,30,40};
		int b[]=new int[a.length];
		int k=50;
		for(int x=0;x<a.length;x++)
		{
		 for(int y=0;y<a.length;y++)
		 {
	        if(a[x]+a[y]==k)
	    	System.out.println(a[x]+" "+a[y]);
		}	
		}
    }

}

