package arrays;

public class Prevpostadd 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5,6,9,4};
		int b[]=new int[8];
		//int sum=0;
		for(int x=0;x<a.length-1;x++)
		{
			if(x==0)
			{
				int sum=0;
				sum=sum+a[0];
				System.out.println(sum);
			}
			else if(x==1)
			{
				int sum=0;
				 sum=sum+a[0]+a[2];
				System.out.println(sum);
			}
			else if(x==2)
			{
				int sum=0;
				sum=sum+a[1]+a[3];
				System.out.println(sum);
			}
			else if(x==3)
			{
				int sum=0;
				sum=sum+a[2]+a[4];
				System.out.println(sum);
		    }
			else if(x==4)
			{
				int sum=0;
				sum+=a[3]+a[5];
				System.out.println(sum);
			}
			else {
			int sum=0;
			sum+=a[4];
			System.out.println(sum);
			}
		}
		
	}

}
