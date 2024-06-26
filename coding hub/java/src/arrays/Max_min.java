package arrays;
import java.util.*;
public class Max_min {

	public static void main(String[] args) 
	{
		int a[]=new int[6];
		int max=Integer.MAX_VALUE;
		//System.out.println(max);
		Random r=new Random();
		for(int x=0;x<a.length;x++)
		{
			a[x]=r.nextInt(10,90);
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.println("this is ax"+a[x]);
			if(max<a[x])
			{
				max=a[x];
			}
			System.out.println(max);
		}
	}

}
