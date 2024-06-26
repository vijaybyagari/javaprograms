package arrays;

public class Unique 
{

	public static void main(String[] args)
	{
	  int a[]=new int[] {4,18,14,16,14,4};
	  boolean b[]=new boolean[a.length];
	  int count=1;
	  for(int x=0;x<a.length;x++)
	  {
		   count=1;
		   if(b[x]==true)
			   continue;
		  for(int y=x+1;y<a.length;y++)
		  {
			  if(a[x]==a[y])
			  {
				  count++;
				  b[y]=true;
			  }
		  }
		  if(count==1)
		 System.out.println(a[x]+" "+count);
	  }

	}

}
