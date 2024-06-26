package javaprograms;

public class Nestedloops 
{
 public static void main(String[] args)
  {
	for (int x=1;x<100;x++)
	{
		int sum=0;
	     for(int start=1;start<=x;start++)
	   { 
		if(x%start==0)
		{
			sum=sum+start;
		}
		System.out.println((x==sum)?sum:" is aperfect number");
		
		
	}
	
   }
	

  }
}
