
public class Range 
{
  public static void main(String[] args)
	{
	  int count=0,sum=0;
	  for(int x=0;x<=100;x++)
	  { 
		  int temp=x;
		  count++;
		  int rem=x%10;
		  sum=sum+(int)Math.pow(rem,count);
		  //System.out.println(sum);
		  x=x/10;
	 System.out.println((sum==temp)?sum+"armstrong":"not armstrong");
	  }
	}
}



