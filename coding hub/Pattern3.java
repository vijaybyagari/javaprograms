package javaprograms;

public class Pattern3 {

	public static void main(String[] args) 
	{
		for( int r=1;r<=6;r++)
		{
		 for(int c=6;c>=r;c--)
		 {
			 if(c>=6)
			 System.out.print(" ");
			 else
			 System.out.print("*");	 
		 }
		 
		 System.out.println();
		}	
	}

}
