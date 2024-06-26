import java.util.*;
public class Equal
{

	public static void main(String[] args)
	{
		int arr[]=new int[] {11,77,34,53};
		int arrb[]=new int[]{90,45,76,21};
		int c[]=new int[arr.length];
		for(int a=0;a<arr.length;a++)
		{
		   c[a]=arr[a]+arrb[a];
		   System.out.println(c[a]);
		}

	}

}
