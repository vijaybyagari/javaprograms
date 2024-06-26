package javaprograms;

public class ArmstrongOrNot
{
	public static void main(String args[])
	{
		int num=153,div=0,count=0,x=num,sum=0,y=num;
		while(num>0)
		{
			div=num%10;
			System.out.println(div+"extraction of num");
			count++;
			num=num/10;
		}
		System.out.println("count is"+count);
		while(x>0)
		{
			int rem=x%10;
			sum=sum+(int)Math.pow(rem,count);
			x=x/10;
		}
		System.out.println("adding of numbers"+sum);
		System.out.println((y==sum)?"is an armstrong number":"not an armstrong number");
	}
}	
		