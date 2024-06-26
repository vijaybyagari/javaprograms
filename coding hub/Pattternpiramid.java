package javaprograms;

public class Pattternpiramid
{
	public static void main(String[] args)
	{
		int temp=1;
	   for(int r=1;r<=6;r++)
	   {
		   for(int s=6;s>r;s--)
		   {
			   System.out.print(" ");
		   }
		   for(int c=1;c<=r;c++)
		   {
			   System.out.print("# ");
		   }
		   System.out.println();
		   temp=temp+2;
		}
	}

}
