package javaprograms;

public class Pattern2 
{

	public static void main(String[] args)
	{
		for(int r=1;r<=6;r++)
		{
		 for(int c=1;c<=r;c++)
		 {
			 if(c==1||c==5||r==1||r==5)
			 System.out.print("#");
			 else
			 System.out.print(" ");	 
		 }	
		 System.out.println();
		}	

	}

}
